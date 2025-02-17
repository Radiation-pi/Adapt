/*------------------------------------------------------------------------------
 -   Adapt is a Skill/Integration plugin  for Minecraft Bukkit Servers
 -   Copyright (c) 2022 Arcane Arts (Volmit Software)
 -
 -   This program is free software: you can redistribute it and/or modify
 -   it under the terms of the GNU General Public License as published by
 -   the Free Software Foundation, either version 3 of the License, or
 -   (at your option) any later version.
 -
 -   This program is distributed in the hope that it will be useful,
 -   but WITHOUT ANY WARRANTY; without even the implied warranty of
 -   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 -   GNU General Public License for more details.
 -
 -   You should have received a copy of the GNU General Public License
 -   along with this program.  If not, see <https://www.gnu.org/licenses/>.
 -----------------------------------------------------------------------------*/

package com.volmit.adapt.api.world;

import com.volmit.adapt.Adapt;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface AdaptComponent {
    default AdaptServer getServer() {
        return Adapt.instance.getAdaptServer();
    }

    default AdaptPlayer getPlayer(Player p) {
        return getServer().getPlayer(p);
    }

    default boolean isItem(ItemStack is) {
        return is != null && !is.getType().equals(Material.AIR);
    }

    default boolean isTool(ItemStack is) {
        return isAxe(is) || isPickaxe(is) || isHoe(is) || isShovel(is) || isSword(is) || isTrident(is);
    }

    default boolean isMelee(ItemStack is) {
        return isTool(is);
    }

    default boolean isXpBlock(Material material) {
        return material.equals(Material.EXPERIENCE_BOTTLE);
    }

    default boolean isRanged(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case BOW, CROSSBOW -> true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isSword(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case DIAMOND_SWORD, GOLDEN_SWORD, IRON_SWORD, NETHERITE_SWORD, STONE_SWORD, WOODEN_SWORD -> true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isTrident(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case TRIDENT, SEA_PICKLE -> true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isAxe(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case DIAMOND_AXE, GOLDEN_AXE, IRON_AXE, NETHERITE_AXE, STONE_AXE, WOODEN_AXE -> true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isPickaxe(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case DIAMOND_PICKAXE, GOLDEN_PICKAXE, IRON_PICKAXE, NETHERITE_PICKAXE, STONE_PICKAXE, WOODEN_PICKAXE ->
                        true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isShovel(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case DIAMOND_SHOVEL, GOLDEN_SHOVEL, IRON_SHOVEL, NETHERITE_SHOVEL, STONE_SHOVEL, WOODEN_SHOVEL -> true;
                default -> false;
            };
        }
        return false;
    }

    default boolean isLog(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case ACACIA_LOG, BIRCH_LOG, CHERRY_LOG, STRIPPED_CHERRY_LOG, STRIPPED_CHERRY_WOOD, DARK_OAK_LOG, JUNGLE_LOG, OAK_LOG, SPRUCE_LOG, STRIPPED_ACACIA_LOG,
                        STRIPPED_BIRCH_LOG, STRIPPED_DARK_OAK_LOG, STRIPPED_JUNGLE_LOG, STRIPPED_OAK_LOG,
                        STRIPPED_SPRUCE_LOG, ACACIA_WOOD, BIRCH_WOOD, DARK_OAK_WOOD, JUNGLE_WOOD, OAK_WOOD,
                        SPRUCE_WOOD, STRIPPED_ACACIA_WOOD, STRIPPED_BIRCH_WOOD, STRIPPED_DARK_OAK_WOOD, STRIPPED_JUNGLE_WOOD,
                        STRIPPED_OAK_WOOD, STRIPPED_SPRUCE_WOOD, MUSHROOM_STEM, BROWN_MUSHROOM_BLOCK, RED_MUSHROOM_BLOCK,
                        MANGROVE_LOG, MANGROVE_ROOTS, MUDDY_MANGROVE_ROOTS, STRIPPED_MANGROVE_LOG, MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD ->
                        true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isLeaves(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case OAK_LEAVES, MANGROVE_ROOTS, MUDDY_MANGROVE_ROOTS, SPRUCE_LEAVES, BIRCH_LEAVES,
                        JUNGLE_LEAVES, ACACIA_LEAVES, DARK_OAK_LEAVES, MANGROVE_LEAVES, CHERRY_LEAVES,
                        AZALEA_LEAVES, FLOWERING_AZALEA_LEAVES -> true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isBoots(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case DIAMOND_BOOTS, GOLDEN_BOOTS, IRON_BOOTS, NETHERITE_BOOTS, CHAINMAIL_BOOTS, LEATHER_BOOTS -> true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isHelmet(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case CHAINMAIL_HELMET, DIAMOND_HELMET, GOLDEN_HELMET, IRON_HELMET, LEATHER_HELMET, NETHERITE_HELMET, TURTLE_HELMET ->
                        true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isLeggings(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case DIAMOND_LEGGINGS, GOLDEN_LEGGINGS, IRON_LEGGINGS, NETHERITE_LEGGINGS, CHAINMAIL_LEGGINGS, LEATHER_LEGGINGS ->
                        true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isChestplate(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case DIAMOND_CHESTPLATE, GOLDEN_CHESTPLATE, IRON_CHESTPLATE, NETHERITE_CHESTPLATE, CHAINMAIL_CHESTPLATE, LEATHER_CHESTPLATE ->
                        true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isElytra(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case ELYTRA, LEGACY_ELYTRA -> true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isHoe(ItemStack it) {
        if (isItem(it)) {
            return switch (it.getType()) {
                case DIAMOND_HOE, GOLDEN_HOE, IRON_HOE, NETHERITE_HOE, STONE_HOE, WOODEN_HOE -> true;
                default -> false;
            };
        }

        return false;
    }

    default boolean isOre(BlockData b) {
        return switch (b.getMaterial()) {
            case COPPER_ORE, DEEPSLATE_COPPER_ORE, COAL_ORE, GOLD_ORE, IRON_ORE, DIAMOND_ORE, LAPIS_ORE, EMERALD_ORE, NETHER_QUARTZ_ORE, NETHER_GOLD_ORE, REDSTONE_ORE, DEEPSLATE_COAL_ORE, DEEPSLATE_IRON_ORE, DEEPSLATE_GOLD_ORE, DEEPSLATE_LAPIS_ORE, DEEPSLATE_DIAMOND_ORE, DEEPSLATE_EMERALD_ORE, DEEPSLATE_REDSTONE_ORE ->
                    true;
            default -> false;
        };
    }

    default boolean isStorage(BlockData b) {
        return switch (b.getMaterial()) {
            case CHEST,
                    SMOKER,
                    TRAPPED_CHEST,
                    SHULKER_BOX,
                    WHITE_SHULKER_BOX,
                    ORANGE_SHULKER_BOX,
                    MAGENTA_SHULKER_BOX,
                    LIGHT_BLUE_SHULKER_BOX,
                    YELLOW_SHULKER_BOX,
                    LIME_SHULKER_BOX,
                    PINK_SHULKER_BOX,
                    GRAY_SHULKER_BOX,
                    LIGHT_GRAY_SHULKER_BOX,
                    CYAN_SHULKER_BOX,
                    PURPLE_SHULKER_BOX,
                    BLUE_SHULKER_BOX,
                    BROWN_SHULKER_BOX,
                    GREEN_SHULKER_BOX,
                    RED_SHULKER_BOX,
                    BLACK_SHULKER_BOX,
                    BARREL,
                    DISPENSER,
                    DROPPER,
                    FURNACE,
                    BLAST_FURNACE,
                    HOPPER -> true;
            default -> false;
        };
    }
}
