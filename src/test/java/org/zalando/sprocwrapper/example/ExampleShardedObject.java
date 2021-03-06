package org.zalando.sprocwrapper.example;

import org.zalando.sprocwrapper.sharding.ShardedObject;

import org.zalando.typemapper.annotations.DatabaseField;

/**
 * @author  hjacobs
 */
public class ExampleShardedObject implements ShardedObject {

    @DatabaseField
    private String key;
    @DatabaseField
    private String value;

    public ExampleShardedObject(final String key, final String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public Object getShardKey() {
        return key;
    }

}
