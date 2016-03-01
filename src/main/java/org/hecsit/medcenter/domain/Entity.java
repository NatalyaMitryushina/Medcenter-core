package org.hecsit.medcenter.domain;

import java.util.UUID;
/**
 * Created by Наталья on 01.03.2016.
 */
public abstract class Entity {
    private UUID _id;

    protected Entity() {
       _id = UUID.randomUUID();
    }

    public UUID Id(){
        return _id;
    }
}
