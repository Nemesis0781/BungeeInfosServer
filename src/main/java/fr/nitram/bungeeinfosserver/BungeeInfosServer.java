package fr.nitram.bungeeinfosserver;

import fr.nitram.bungeeinfosserver.communication.redis.RedisAccess;
import fr.nitram.bungeeinfosserver.utils.MessageUtils;
import fr.nitram.commons.RedisPubSub;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;
import org.redisson.api.RedissonClient;

public final class BungeeInfosServer extends Plugin {

    @Override
    public void onEnable() {

        RedisAccess.init();
        registerPubSub();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerPubSub() {

        final RedissonClient redissonClient = RedisAccess.instance.getRedissonClient();

        redissonClient.getTopic("pubSubMessage").addListener(RedisPubSub.class, (channel, pubSubMessage) -> {

            final ProxiedPlayer proxiedPlayer = getProxy().getPlayer(pubSubMessage.getUuid());

            if(proxiedPlayer == null)
                return;

            final String message = pubSubMessage.getMessage();
            final String value = pubSubMessage.getValue();

            ComponentBuilder componentBuilder = null;

            if(message.equals("serverinfos")) {

                final ServerInfo serverInfo = getProxy().getServerInfo(value);

                if(serverInfo == null) {

                    componentBuilder = MessageUtils.buildText(ChatColor.RED + "Le serveur " + value + " n'éxiste pas.");
                    proxiedPlayer.sendMessage(componentBuilder.create());
                    return;
                }

                componentBuilder = MessageUtils.buildText(ChatColor.GOLD + "Nom : " + ChatColor.WHITE + serverInfo.getName());
                componentBuilder = MessageUtils.buildText(componentBuilder, ChatColor.GOLD + "MOTD : " + ChatColor.WHITE + serverInfo.getName());
                componentBuilder = MessageUtils.buildText(componentBuilder, ChatColor.GOLD + "Joueurs : " + ChatColor.WHITE + serverInfo.getPlayers());

                proxiedPlayer.sendMessage(componentBuilder.create());
                return;
            }



        });
    }
}
