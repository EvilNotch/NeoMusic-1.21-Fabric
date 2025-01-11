package net.evilnotch.neomusic.sound;

import net.evilnotch.neomusic.NeoMusic;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent MEND = registerSoundEvent("mend");
    public static final SoundEvent SPARK = registerSoundEvent("spark");
    public static final SoundEvent FOG = registerSoundEvent("fog");
    public static final RegistryKey<JukeboxSong> MEND_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NeoMusic.MOD_ID, "mend"));
    public static final RegistryKey<JukeboxSong> SPARK_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NeoMusic.MOD_ID, "spark"));
    public static final RegistryKey<JukeboxSong> FOG_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NeoMusic.MOD_ID, "fog"));


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(NeoMusic.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        NeoMusic.LOGGER.info("Registering Mod Sounds for " + NeoMusic.MOD_ID);
    }
}
