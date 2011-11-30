package br.com.digilabs.jqplot.data;

import org.json.JSONArray;

/**
 *
 * @author inaiat
 */
public class MeterData extends NumberData {

    public MeterData() {
    }

    public MeterData(Number value) {
        setValue(value);
    }

    @Override
    public Number getData() {
        return data;
    }
    @Override
    public String toJsonString() {
        JSONArray jsonArray = new JSONArray();
        JSONArray valueArray = new JSONArray();
        valueArray.put(data);
        jsonArray.put(valueArray);
        return jsonArray.toString();
    }
}
