# Ornithe Template Mod

The official Ornithe template mod. You can use it as a template for your own mods!

## WIP Gen2

This template is for "gen2", our work-in-progress generation of development tools. While gen2 brings improvements and new features, it is not yet stable. Keep in mind:
- gen2 cannot (yet) be installed and used by end-users
- gen2 intermediary may be re-generated at any time until it becomes stable, this will invalidate your gradle cache
- gen2 may yet have bugs to be ironed out, please report any issues you find

## Usage

In order to use this mod as a template:

1. Create a new repository from this template with `Use this template`
    - Tick the box "Include all branches"
2. Clone the recently-created repo on your PC
3. Make the necessary changes in order to make it yours:
    - Update `gradle.properties` in order to use your 
        - Update your mod's Maven group and mod ID
            - If you don't know which Maven group to use, and you are planning to host the mod's source code on GitHub, use `io.github.<Your_Username_Here>`
        - Update your mod's dependencies
            - Check [our develop page](https://ornithemc.net/develop) for the latest available versions.
    - Update `fabric.mod.json` in order to reflect your mod's metadata
        - If you are planning to include (jar-in-jar) a mod, don't forget to declare its dependency on it!
        - The icon provided here is a placeholder one. If you aren't able to replace it yet, you can delete it and remove the "icon" property
    - Create a LICENSE file for this mod! If you don't know which license to use, check out [here](https://choosealicense.com/).
        - If you use `LICENSE.md`, don't forget to update the buildscript in order to use that file name!
        - In `fabric.mod.json`, don't forget to put the license's [SPDX identifier](https://spdx.org/licenses/) under the `"license"` property`.
        - The GPLv3 and AGPLv3 are not valid mod licenses, so you can use almost any license except for those.
    - Update the Java sub-directory structure so it reflects your Maven group
4. The mod is now ready to be worked on!

## License

This template on the OrnitheMC GitHub is licensed under the [Creative Common Zero v1.0 license](./LICENSE-TEMPLATE.md).

Mods created with this template are not automatically licensed under the CC0, and are not required to give any kind of credit back to OrnitheMC for this template.
