package fr.nitram.bungeeinfosserver.utils;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;

public class MessageUtils {

    /**
     * Build a hover component for Player.spigot().sendMessage(this.create());
     * @param base - Base message
     * @param hover - Hover message
     * @return ComponentBuilder
     */
    public static ComponentBuilder buildHover(String base, String hover) {
        base = ChatColor.WHITE + base;
        hover = ChatColor.WHITE + hover;

        String[] bC = base.split("§");
        String[] hC = hover.split("§");

        ComponentBuilder bCB = new ComponentBuilder("");
        for(int bI=0; bI<bC.length; bI++) {
            String b = bC[bI];
            if(b.equals(bC[0])) continue;
            bCB.append(b.substring(1));

            int bBack = 0;
            boolean[] bdidModify = new boolean[]{false, false, false, false, false, false};
            bCB.reset();
            //bCB.bold(false); bCB.italic(false); bCB.strikethrough(false); bCB.underlined(false); bCB.obfuscated(false); bCB.color(ChatColor.WHITE);
            top: while(bI-bBack > 0 && bC[bI-bBack] != null) {
                if(!bC[bI-bBack].substring(1).equals("") && bBack != 0) break top;
                ChatColor bBackCC = ChatColor.getByChar(bC[bI-bBack].charAt(0));

                if(bBackCC == ChatColor.BOLD && !bdidModify[0])  {
                    bCB.bold(true);
                    bdidModify[0] = true;
                }
                else if(bBackCC == ChatColor.ITALIC && !bdidModify[1]) {
                    bCB.italic(true);
                    bdidModify[1] = true;
                }
                else if(bBackCC == ChatColor.STRIKETHROUGH && !bdidModify[2]) {
                    bCB.strikethrough(true);
                    bdidModify[2] = true;
                }
                else if(bBackCC == ChatColor.UNDERLINE && !bdidModify[3]) {
                    bCB.underlined(true);
                    bdidModify[3] = true;
                }
                else if(bBackCC == ChatColor.MAGIC && !bdidModify[4]) {
                    bCB.obfuscated(true);
                    bdidModify[4] = true;
                }
                else if(!bdidModify[5]){
                    bCB.color(bBackCC);
                    bdidModify[5] = true;
                }

                bBack++;
            }

            ComponentBuilder hCB = new ComponentBuilder("");
            for(int hI=0; hI<hC.length; hI++) {
                String h = hC[hI];
                if(h.equals(hC[0])) continue;
                hCB.append(h.substring(1));

                int hBack = 0;
                boolean[] hdidModify = new boolean[]{false, false, false, false, false, false};
                hCB.reset();
                //hCB.bold(false); hCB.italic(false); hCB.strikethrough(false); hCB.underlined(false); hCB.obfuscated(false); hCB.color(ChatColor.WHITE);
                top: while(hI-hBack > 0 && hC[hI-hBack] != null) {
                    if(!hC[hI-hBack].substring(1).equals("") && hBack != 0) break top;
                    ChatColor hBackCC = ChatColor.getByChar(hC[hI-hBack].charAt(0));

                    if(hBackCC == ChatColor.BOLD && !hdidModify[0])  {
                        hCB.bold(true);
                        hdidModify[0] = true;
                    }
                    else if(hBackCC == ChatColor.ITALIC && !hdidModify[1]) {
                        hCB.italic(true);
                        hdidModify[1] = true;
                    }
                    else if(hBackCC == ChatColor.STRIKETHROUGH && !hdidModify[2]) {
                        hCB.strikethrough(true);
                        hdidModify[2] = true;
                    }
                    else if(hBackCC == ChatColor.UNDERLINE && !hdidModify[3]) {
                        hCB.underlined(true);
                        hdidModify[3] = true;
                    }
                    else if(hBackCC == ChatColor.MAGIC && !hdidModify[4]) {
                        hCB.obfuscated(true);
                        hdidModify[4] = true;
                    }
                    else if(!hdidModify[5]){
                        hCB.color(hBackCC);
                        hdidModify[5] = true;
                    }

                    hBack++;
                }
            }
            bCB.event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, hCB.create()));
        }
        return bCB;
    }

    /**
     * Build a hover component for Player.spigot().sendMessage(this.create());
     * @param bCB - Use existing builder
     * @param base - Base message
     * @param hover - Hover message
     * @return ComponentBuilder
     */
    public static ComponentBuilder buildHover(ComponentBuilder bCB, String base, String hover) {
        base = ChatColor.WHITE + base;
        hover = ChatColor.WHITE + hover;

        String[] bC = base.split("§");
        String[] hC = hover.split("§");

        for(int bI=0; bI<bC.length; bI++) {
            String b = bC[bI];
            if(b.equals(bC[0])) continue;
            bCB.append(b.substring(1));

            int bBack = 0;
            boolean[] bdidModify = new boolean[]{false, false, false, false, false, false};
            bCB.reset();
            //bCB.bold(false); bCB.italic(false); bCB.strikethrough(false); bCB.underlined(false); bCB.obfuscated(false); bCB.color(ChatColor.WHITE);
            top: while(bI-bBack > 0 && bC[bI-bBack] != null) {
                if(!bC[bI-bBack].substring(1).equals("") && bBack != 0) break top;
                ChatColor bBackCC = ChatColor.getByChar(bC[bI-bBack].charAt(0));

                if(bBackCC == ChatColor.BOLD && !bdidModify[0])  {
                    bCB.bold(true);
                    bdidModify[0] = true;
                }
                else if(bBackCC == ChatColor.ITALIC && !bdidModify[1]) {
                    bCB.italic(true);
                    bdidModify[1] = true;
                }
                else if(bBackCC == ChatColor.STRIKETHROUGH && !bdidModify[2]) {
                    bCB.strikethrough(true);
                    bdidModify[2] = true;
                }
                else if(bBackCC == ChatColor.UNDERLINE && !bdidModify[3]) {
                    bCB.underlined(true);
                    bdidModify[3] = true;
                }
                else if(bBackCC == ChatColor.MAGIC && !bdidModify[4]) {
                    bCB.obfuscated(true);
                    bdidModify[4] = true;
                }
                else if(!bdidModify[5]){
                    bCB.color(bBackCC);
                    bdidModify[5] = true;
                }

                bBack++;
            }

            ComponentBuilder hCB = new ComponentBuilder("");
            for(int hI=0; hI<hC.length; hI++) {
                String h = hC[hI];
                if(h.equals(hC[0])) continue;
                hCB.append(h.substring(1));

                int hBack = 0;
                boolean[] hdidModify = new boolean[]{false, false, false, false, false, false};
                hCB.reset();
                //hCB.bold(false); hCB.italic(false); hCB.strikethrough(false); hCB.underlined(false); hCB.obfuscated(false); hCB.color(ChatColor.WHITE);
                top: while(hI-hBack > 0 && hC[hI-hBack] != null) {
                    if(!hC[hI-hBack].substring(1).equals("") && hBack != 0) break top;
                    ChatColor hBackCC = ChatColor.getByChar(hC[hI-hBack].charAt(0));

                    if(hBackCC == ChatColor.BOLD && !hdidModify[0])  {
                        hCB.bold(true);
                        hdidModify[0] = true;
                    }
                    else if(hBackCC == ChatColor.ITALIC && !hdidModify[1]) {
                        hCB.italic(true);
                        hdidModify[1] = true;
                    }
                    else if(hBackCC == ChatColor.STRIKETHROUGH && !hdidModify[2]) {
                        hCB.strikethrough(true);
                        hdidModify[2] = true;
                    }
                    else if(hBackCC == ChatColor.UNDERLINE && !hdidModify[3]) {
                        hCB.underlined(true);
                        hdidModify[3] = true;
                    }
                    else if(hBackCC == ChatColor.MAGIC && !hdidModify[4]) {
                        hCB.obfuscated(true);
                        hdidModify[4] = true;
                    }
                    else if(!hdidModify[5]){
                        hCB.color(hBackCC);
                        hdidModify[5] = true;
                    }

                    hBack++;
                }
            }
            bCB.event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, hCB.create()));
        }
        return bCB;
    }

    /**
     * Build a command component for Player.spigot().sendMessage(this.create());
     * @param base - Base message
     * @param cmd - Command
     * @return ComponentBuilder
     */
    public static ComponentBuilder buildCommand(String base, String cmd) {
        base = ChatColor.WHITE + base;

        String[] bC = base.split("§");

        ComponentBuilder bCB = new ComponentBuilder("");
        for(int bI=0; bI<bC.length; bI++) {
            String b = bC[bI];
            if(b.equals(bC[0])) continue;
            bCB.append(b.substring(1));

            int bBack = 0;
            boolean[] bdidModify = new boolean[]{false, false, false, false, false, false};
            bCB.reset();
            //bCB.bold(false); bCB.italic(false); bCB.strikethrough(false); bCB.underlined(false); bCB.obfuscated(false); bCB.color(ChatColor.WHITE);
            top: while(bI-bBack > 0 && bC[bI-bBack] != null) {
                if(!bC[bI-bBack].substring(1).equals("") && bBack != 0) break top;
                ChatColor bBackCC = ChatColor.getByChar(bC[bI-bBack].charAt(0));

                if(bBackCC == ChatColor.BOLD && !bdidModify[0])  {
                    bCB.bold(true);
                    bdidModify[0] = true;
                }
                else if(bBackCC == ChatColor.ITALIC && !bdidModify[1]) {
                    bCB.italic(true);
                    bdidModify[1] = true;
                }
                else if(bBackCC == ChatColor.STRIKETHROUGH && !bdidModify[2]) {
                    bCB.strikethrough(true);
                    bdidModify[2] = true;
                }
                else if(bBackCC == ChatColor.UNDERLINE && !bdidModify[3]) {
                    bCB.underlined(true);
                    bdidModify[3] = true;
                }
                else if(bBackCC == ChatColor.MAGIC && !bdidModify[4]) {
                    bCB.obfuscated(true);
                    bdidModify[4] = true;
                }
                else if(!bdidModify[5]){
                    bCB.color(bBackCC);
                    bdidModify[5] = true;
                }

                bBack++;
            }

            bCB.event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, cmd));
        }
        return bCB;
    }

    /**
     * Build a command component for Player.spigot().sendMessage(this.create());
     * @param bCB - Use existing builder
     * @param base - Base message
     * @param cmd - Command
     * @return ComponentBuilder
     */
    public static ComponentBuilder buildCommand(ComponentBuilder bCB, String base, String cmd) {
        base = ChatColor.WHITE + base;

        String[] bC = base.split("§");

        for(int bI=0; bI<bC.length; bI++) {
            String b = bC[bI];
            if(b.equals(bC[0])) continue;
            bCB.append(b.substring(1));

            int bBack = 0;
            boolean[] bdidModify = new boolean[]{false, false, false, false, false, false};
            bCB.reset();
            //bCB.bold(false); bCB.italic(false); bCB.strikethrough(false); bCB.underlined(false); bCB.obfuscated(false); bCB.color(ChatColor.WHITE);
            top: while(bI-bBack > 0 && bC[bI-bBack] != null) {
                if(!bC[bI-bBack].substring(1).equals("") && bBack != 0) break top;
                ChatColor bBackCC = ChatColor.getByChar(bC[bI-bBack].charAt(0));

                if(bBackCC == ChatColor.BOLD && !bdidModify[0])  {
                    bCB.bold(true);
                    bdidModify[0] = true;
                }
                else if(bBackCC == ChatColor.ITALIC && !bdidModify[1]) {
                    bCB.italic(true);
                    bdidModify[1] = true;
                }
                else if(bBackCC == ChatColor.STRIKETHROUGH && !bdidModify[2]) {
                    bCB.strikethrough(true);
                    bdidModify[2] = true;
                }
                else if(bBackCC == ChatColor.UNDERLINE && !bdidModify[3]) {
                    bCB.underlined(true);
                    bdidModify[3] = true;
                }
                else if(bBackCC == ChatColor.MAGIC && !bdidModify[4]) {
                    bCB.obfuscated(true);
                    bdidModify[4] = true;
                }
                else if(!bdidModify[5]){
                    bCB.color(bBackCC);
                    bdidModify[5] = true;
                }

                bBack++;
            }

            bCB.event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, cmd));
        }
        return bCB;
    }

    /**
     * Build a hover/cmd component for Player.spigot().sendMessage(this.create());
     * @param base - Base message
     * @param hover - Hover message
     * @param cmd - Command
     * @return ComponentBuilder
     */
    public static ComponentBuilder buildHoverWithCMD(String base, String hover, String cmd) {
        base = ChatColor.WHITE + base;
        hover = ChatColor.WHITE + hover;

        String[] bC = base.split("§");
        String[] hC = hover.split("§");

        ComponentBuilder bCB = new ComponentBuilder("");
        for(int bI=0; bI<bC.length; bI++) {
            String b = bC[bI];
            if(b.equals(bC[0])) continue;
            bCB.append(b.substring(1));

            int bBack = 0;
            boolean[] bdidModify = new boolean[]{false, false, false, false, false, false};
            bCB.reset();
            //bCB.bold(false); bCB.italic(false); bCB.strikethrough(false); bCB.underlined(false); bCB.obfuscated(false); bCB.color(ChatColor.WHITE);
            top: while(bI-bBack > 0 && bC[bI-bBack] != null) {
                if(!bC[bI-bBack].substring(1).equals("") && bBack != 0) break top;
                ChatColor bBackCC = ChatColor.getByChar(bC[bI-bBack].charAt(0));

                if(bBackCC == ChatColor.BOLD && !bdidModify[0])  {
                    bCB.bold(true);
                    bdidModify[0] = true;
                }
                else if(bBackCC == ChatColor.ITALIC && !bdidModify[1]) {
                    bCB.italic(true);
                    bdidModify[1] = true;
                }
                else if(bBackCC == ChatColor.STRIKETHROUGH && !bdidModify[2]) {
                    bCB.strikethrough(true);
                    bdidModify[2] = true;
                }
                else if(bBackCC == ChatColor.UNDERLINE && !bdidModify[3]) {
                    bCB.underlined(true);
                    bdidModify[3] = true;
                }
                else if(bBackCC == ChatColor.MAGIC && !bdidModify[4]) {
                    bCB.obfuscated(true);
                    bdidModify[4] = true;
                }
                else if(!bdidModify[5]){
                    bCB.color(bBackCC);
                    bdidModify[5] = true;
                }

                bBack++;
            }

            ComponentBuilder hCB = new ComponentBuilder("");
            for(int hI=0; hI<hC.length; hI++) {
                String h = hC[hI];
                if(h.equals(hC[0])) continue;
                hCB.append(h.substring(1));

                int hBack = 0;
                boolean[] hdidModify = new boolean[]{false, false, false, false, false, false};
                hCB.reset();
                //hCB.bold(false); hCB.italic(false); hCB.strikethrough(false); hCB.underlined(false); hCB.obfuscated(false); hCB.color(ChatColor.WHITE);
                top: while(hI-hBack > 0 && hC[hI-hBack] != null) {
                    if(!hC[hI-hBack].substring(1).equals("") && hBack != 0) break top;
                    ChatColor hBackCC = ChatColor.getByChar(hC[hI-hBack].charAt(0));

                    if(hBackCC == ChatColor.BOLD && !hdidModify[0])  {
                        hCB.bold(true);
                        hdidModify[0] = true;
                    }
                    else if(hBackCC == ChatColor.ITALIC && !hdidModify[1]) {
                        hCB.italic(true);
                        hdidModify[1] = true;
                    }
                    else if(hBackCC == ChatColor.STRIKETHROUGH && !hdidModify[2]) {
                        hCB.strikethrough(true);
                        hdidModify[2] = true;
                    }
                    else if(hBackCC == ChatColor.UNDERLINE && !hdidModify[3]) {
                        hCB.underlined(true);
                        hdidModify[3] = true;
                    }
                    else if(hBackCC == ChatColor.MAGIC && !hdidModify[4]) {
                        hCB.obfuscated(true);
                        hdidModify[4] = true;
                    }
                    else if(!hdidModify[5]){
                        hCB.color(hBackCC);
                        hdidModify[5] = true;
                    }

                    hBack++;
                }
            }
            bCB.event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, hCB.create()));
            bCB.event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, cmd));
        }
        return bCB;
    }

    /**
     * Build a hover/cmd component for Player.spigot().sendMessage(this.create());
     * @param bCB - Use existing builder
     * @param base - Base message
     * @param hover - Hover message
     * @param cmd - Command
     * @return ComponentBuilder
     */
    public static ComponentBuilder buildHoverWithCMD(ComponentBuilder bCB, String base, String hover, String cmd) {
        base = ChatColor.WHITE + base;
        hover = ChatColor.WHITE + hover;

        String[] bC = base.split("§");
        String[] hC = hover.split("§");

        for(int bI=0; bI<bC.length; bI++) {
            String b = bC[bI];
            if(b.equals(bC[0])) continue;
            bCB.append(b.substring(1));

            int bBack = 0;
            boolean[] bdidModify = new boolean[]{false, false, false, false, false, false};
            bCB.reset();
            //bCB.bold(false); bCB.italic(false); bCB.strikethrough(false); bCB.underlined(false); bCB.obfuscated(false); bCB.color(ChatColor.WHITE);
            top: while(bI-bBack > 0 && bC[bI-bBack] != null) {
                if(!bC[bI-bBack].substring(1).equals("") && bBack != 0) break top;
                ChatColor bBackCC = ChatColor.getByChar(bC[bI-bBack].charAt(0));

                if(bBackCC == ChatColor.BOLD && !bdidModify[0])  {
                    bCB.bold(true);
                    bdidModify[0] = true;
                }
                else if(bBackCC == ChatColor.ITALIC && !bdidModify[1]) {
                    bCB.italic(true);
                    bdidModify[1] = true;
                }
                else if(bBackCC == ChatColor.STRIKETHROUGH && !bdidModify[2]) {
                    bCB.strikethrough(true);
                    bdidModify[2] = true;
                }
                else if(bBackCC == ChatColor.UNDERLINE && !bdidModify[3]) {
                    bCB.underlined(true);
                    bdidModify[3] = true;
                }
                else if(bBackCC == ChatColor.MAGIC && !bdidModify[4]) {
                    bCB.obfuscated(true);
                    bdidModify[4] = true;
                }
                else if(!bdidModify[5]){
                    bCB.color(bBackCC);
                    bdidModify[5] = true;
                }

                bBack++;
            }

            ComponentBuilder hCB = new ComponentBuilder("");
            for(int hI=0; hI<hC.length; hI++) {
                String h = hC[hI];
                if(h.equals(hC[0])) continue;
                hCB.append(h.substring(1));

                int hBack = 0;
                boolean[] hdidModify = new boolean[]{false, false, false, false, false, false};
                hCB.reset();
                //hCB.bold(false); hCB.italic(false); hCB.strikethrough(false); hCB.underlined(false); hCB.obfuscated(false); hCB.color(ChatColor.WHITE);
                top: while(hI-hBack > 0 && hC[hI-hBack] != null) {
                    if(!hC[hI-hBack].substring(1).equals("") && hBack != 0) break top;
                    ChatColor hBackCC = ChatColor.getByChar(hC[hI-hBack].charAt(0));

                    if(hBackCC == ChatColor.BOLD && !hdidModify[0])  {
                        hCB.bold(true);
                        hdidModify[0] = true;
                    }
                    else if(hBackCC == ChatColor.ITALIC && !hdidModify[1]) {
                        hCB.italic(true);
                        hdidModify[1] = true;
                    }
                    else if(hBackCC == ChatColor.STRIKETHROUGH && !hdidModify[2]) {
                        hCB.strikethrough(true);
                        hdidModify[2] = true;
                    }
                    else if(hBackCC == ChatColor.UNDERLINE && !hdidModify[3]) {
                        hCB.underlined(true);
                        hdidModify[3] = true;
                    }
                    else if(hBackCC == ChatColor.MAGIC && !hdidModify[4]) {
                        hCB.obfuscated(true);
                        hdidModify[4] = true;
                    }
                    else if(!hdidModify[5]){
                        hCB.color(hBackCC);
                        hdidModify[5] = true;
                    }

                    hBack++;
                }
            }
            bCB.event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, hCB.create()));
            bCB.event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, cmd));
        }
        return bCB;
    }

    /**
     * Build a text component for Player.spigot().sendMessage(this.create());
     * @param base - Base message
     * @return ComponentBuilder
     */
    public static ComponentBuilder buildText(String base) {
        base = ChatColor.WHITE + base;

        String[] bC = base.split("§");

        ComponentBuilder bCB = new ComponentBuilder("");
        for(int bI=0; bI<bC.length; bI++) {
            String b = bC[bI];
            if(b.equals(bC[0])) continue;
            bCB.append(b.substring(1));

            int bBack = 0;
            boolean[] bdidModify = new boolean[]{false, false, false, false, false, false};
            bCB.reset();
            //bCB.bold(false); bCB.italic(false); bCB.strikethrough(false); bCB.underlined(false); bCB.obfuscated(false); bCB.color(ChatColor.WHITE);
            top: while(bI-bBack > 0 && bC[bI-bBack] != null) {
                if(!bC[bI-bBack].substring(1).equals("") && bBack != 0) break top;
                ChatColor bBackCC = ChatColor.getByChar(bC[bI-bBack].charAt(0));

                if(bBackCC == ChatColor.BOLD && !bdidModify[0])  {
                    bCB.bold(true);
                    bdidModify[0] = true;
                }
                else if(bBackCC == ChatColor.ITALIC && !bdidModify[1]) {
                    bCB.italic(true);
                    bdidModify[1] = true;
                }
                else if(bBackCC == ChatColor.STRIKETHROUGH && !bdidModify[2]) {
                    bCB.strikethrough(true);
                    bdidModify[2] = true;
                }
                else if(bBackCC == ChatColor.UNDERLINE && !bdidModify[3]) {
                    bCB.underlined(true);
                    bdidModify[3] = true;
                }
                else if(bBackCC == ChatColor.MAGIC && !bdidModify[4]) {
                    bCB.obfuscated(true);
                    bdidModify[4] = true;
                }
                else if(!bdidModify[5]){
                    bCB.color(bBackCC);
                    bdidModify[5] = true;
                }

                bBack++;
            }
        }
        return bCB;
    }

    /**
     * Build a text component for Player.spigot().sendMessage(this.create());
     * @param bCB - Use existing builder
     * @param base - Base message
     * @return ComponentBuilder
     */
    public static ComponentBuilder buildText(ComponentBuilder bCB, String base) {
        base = ChatColor.WHITE + base;

        String[] bC = base.split("§");

        for(int bI=0; bI<bC.length; bI++) {
            String b = bC[bI];
            if(b.equals(bC[0])) continue;
            bCB.append(b.substring(1));

            int bBack = 0;
            boolean[] bdidModify = new boolean[]{false, false, false, false, false, false};
            bCB.reset();
            //bCB.bold(false); bCB.italic(false); bCB.strikethrough(false); bCB.underlined(false); bCB.obfuscated(false); bCB.color(ChatColor.WHITE);
            top: while(bI-bBack > 0 && bC[bI-bBack] != null) {
                if(!bC[bI-bBack].substring(1).equals("") && bBack != 0) break top;
                ChatColor bBackCC = ChatColor.getByChar(bC[bI-bBack].charAt(0));

                if(bBackCC == ChatColor.BOLD && !bdidModify[0])  {
                    bCB.bold(true);
                    bdidModify[0] = true;
                }
                else if(bBackCC == ChatColor.ITALIC && !bdidModify[1]) {
                    bCB.italic(true);
                    bdidModify[1] = true;
                }
                else if(bBackCC == ChatColor.STRIKETHROUGH && !bdidModify[2]) {
                    bCB.strikethrough(true);
                    bdidModify[2] = true;
                }
                else if(bBackCC == ChatColor.UNDERLINE && !bdidModify[3]) {
                    bCB.underlined(true);
                    bdidModify[3] = true;
                }
                else if(bBackCC == ChatColor.MAGIC && !bdidModify[4]) {
                    bCB.obfuscated(true);
                    bdidModify[4] = true;
                }
                else if(!bdidModify[5]){
                    bCB.color(bBackCC);
                    bdidModify[5] = true;
                }

                bBack++;
            }
        }
        return bCB;
    }

    public static String toString(ComponentBuilder bCB) {
        String message = "";
        for(BaseComponent bc : bCB.create()) {
            message += bc.toPlainText();
        }
        return message;
    }
}

