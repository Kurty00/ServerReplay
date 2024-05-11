package me.senseiwells.replay.mixin.rejoin;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.server.level.ChunkHolder;
import net.minecraft.server.level.ChunkMap;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ChunkMap.class)
public interface ChunkMapAccessor {
	@Accessor("entityMap")
	Int2ObjectMap<ChunkMap.TrackedEntity> getEntityMap();

	@Nullable
	@Invoker("getUpdatingChunkIfPresent")
	ChunkHolder getTickingChunk(long pos);
}
