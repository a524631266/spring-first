package com.zhangll.c_inject_2.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollData {
    private String[] arrayData;
    private List<String> listData;
    private Set<String> setData;
    private Map<String, String> mapData;
    private Properties propsData;

    public String[] getArrayData() {
        return this.arrayData;
    }

    public void setArrayData(String[] arrayData) {
        this.arrayData = arrayData;
    }

    public List<String> getListData() {
        return this.listData;
    }

    public void setListData(List<String> listData) {
        this.listData = listData;
    }

    public Set<String> getSetData() {
        return this.setData;
    }

    public void setSetData(Set<String> setData) {
        this.setData = setData;
    }

    public Map<String, String> getMapData() {
        return this.mapData;
    }

    public void setMapData(Map<String, String> mapData) {
        this.mapData = mapData;
    }

    public Properties getPropsData() {
        return this.propsData;
    }

    public void setPropsData(Properties propsData) {
        this.propsData = propsData;
    }

    @Override
    public String toString() {
        return "{" + " arrayData='" + Arrays.toString(getArrayData()) + "'" + ",\n listData='" + getListData() + "'"
                + ",\n setData='" + getSetData() + "'" + ",\n mapData='" + getMapData() + "'" + ",\n propsData='"
                + getPropsData() + "'" + "}";
    }

}