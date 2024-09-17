# WARNING!!!
THIS ADDON IS CURRENTLY UNDER DEVELOPMENT AND IS THEREFOR EXTREMLY UNSTABLE!!!

DO NOT USE!!!



## FastPlays Thunderhack addon
(Plans to maybe one day port blackout to this)



### Getting Started

- Download latest release from releases and ad to mods folder with thunderhack


### Template Structure

This template includes essential components to kickstart your addon development:

- `src/client/java/com/example/ExampleMod.java`: Defines the main class that your addon should use.
- `src/client/resources/fabric.mod.json`: Contains mod metadata. Update this file with your addon's details, such as name, version, and description.

### Developing Your Addon

Consider the following guidelines while developing your addon:

- **Modules**: Define new modules in the `getModules` method of your main class.
- **Commands**: Implement custom commands in the `getCommands` method.
- **Initialization**: Use the `onInitialize` method for setup tasks when your addon is loaded.
- **Metadata**: Provide your addon's metadata by implementing the `getName`, `getAuthor`, `getPackage`, and `getRepo` methods.

### Contribution

Contributions to ThunderHack and its ecosystem are welcome. If you have improvements or fixes for the addon template, feel free to submit a pull request.

### License

This template is provided under the MIT License. See the `LICENSE` file for more details.

### Acknowledgments

- Thanks to the ThunderHack team and the Minecraft modding community for their support and contributions.

Happy Modding!
