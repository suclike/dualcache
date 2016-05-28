package com.vincentbrison.openlibraries.android.dualcache;

/**
 * This cacheinterface describe the way an object should be serialized/deserialized into String.
 * @param <T> is the class of object to serialized/deserialized.
 */
public interface CacheSerializer<T> {
    /**
     * Deserialization of a String into an object.
     * @param data is the byte array representing the serialized data.
     * @return the deserialized data.
     */
    T fromBytes(byte[] data);

    /**
     * Serialization of an object into String.
     * @param object is the object to serialize.
     * @return the result of the serialization into a byte array.
     */
    byte[] toBytes(T object);
}