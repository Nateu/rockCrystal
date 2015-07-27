# Rock Crystals Mod
This is my first time coding in JAVA and I decided to do some Minecraft modding using Forge.

## Basic description
This mod is inspired by the [Tok'Ra Tunnels](http://stargate.wikia.com/wiki/Tok'ra_tunnel) from the Stargate SG-1 tv series.
It will spawn in a new ore type in the world (still on my todo list; world generation) which can be mined for Rock Crystals.
These crystals can then be used in various ways to be able to generate a tunnel system. The generation will consume all blocks and items that are in de desigated area, be sure to remove valuable items, chests and such. This method of tunneling should be used in regions that are already explored or have little to no chance of having special blocks.

## Blocks and Items

#### BLOCK :: Rock Crystal Ore
Will drop a variable amount of Rock Crystals

#### ITEM :: Rock Crystals
Dropped by mining Rock Crystal Ore. Nine of these can be crafted into a Rock Crystal Block. replace the middle crystal with a Red Stone Block to craft a Power Crystal

#### BLOCK :: Rock Crystal Block
Multiple blocks can be used togther witch Power Crystals to creat Tunnel section blocks.

#### BLOCK(S) :: tunnel section blocks
There are several type of tunnel section blocks. Most of them generate a section of tunnel with a length of 9 blocks. All sections are 3 by 3 (interior) have a crystalline Block floor and ceiling. Depening on the type of section the side walls will be filled in with the same Crystalline Blocks.  

section types:
- straight section
- ending
- corner
- junction
- T-junction

#### ITEM :: Power Crystal
The Power Crystal is used in all tunnel section blocks and to make a Rock Crystal Rod.

#### BLOCK :: Crystalline Block
This is a unique block that is only obtained when the crystals are used in tunnel generation.

#### ITEM :: Rock Crystal Rod
There is only one use for this silly rod and that is to activate a tunnel section. It will start the generation of the tunnel and the Cristalline Blocks. All tunnels section blocks can only generate in a horizontal plane. (Be crafty when you want to tunnel up or down!)  
When a tunnel section block is hit on a side of the block where a tunnel opening will be it wil trigger the block and generate the tunnel section in the opposit direction (e.g. if hit on the north face of the block it will generate towards the south) This wat one can stand in a tunnle place the next section block activate it and move through it to the create the next section.

## Recipes

### Rock Crystal Block
C|C|C  
C|C|C  
C|C|C  

C = Rock Crystal

### Power Crystal
C|C|C  
C|R|C  
C|C|C  

C = Rock Crystal  
R = Red Stone Block

### Rock Crystal Rod
 |C|  
C|P|C  
 |S|  

C = Rock Crystal  
P = Power Crystal  
S = Stick  

## Resources used

- Worked through the Devoxx4Kids [Minecraft Mod workshop](https://github.com/devoxx4kids/materials/tree/master/workshops/minecraft) during Minecon 2015.

- Used more indepth tutorials from [jimdo](http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-8/)
 - [Basic Modfile](http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-8/basic-modfile/)
 - [Proxies](http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-8/proxies/)
 - [First Item](http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-8/first-item/)
 - [First Block](http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-8/first-block/)

- Took some of the Creative tab stuff from [Minecraft Forge Tuts](http://tutorials.darkhax.net/custom-creative-tabs.html)

## Known issues

There are still some issues I need to fix:

- All textures need to be redone


#### FIXED
- Textures for the blocks and items don't show properly
- All mod blocks and items won't display in the custom tab
