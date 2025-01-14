package com.fusionflux.starminer.util;

import net.minecraft.util.math.Vec3d;

public interface EntityAttachments {
    int getPlateGravityTimer();

    void setPlateGravityTimer(int gravityTimer);

    int getStarGravityTimer();

    void setStarGravityTimer(int gravityTimer);

    Vec3d getLastSSMVel();
}
