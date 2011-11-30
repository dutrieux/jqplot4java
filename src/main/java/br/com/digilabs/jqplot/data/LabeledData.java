package br.com.digilabs.jqplot.data;

import br.com.digilabs.jqplot.data.item.LabeledItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.JSONArray;

public class LabeledData<T extends Number> extends AbstractCollectionData<LabeledItem<T>> {

    private List<LabeledItem<T>> data = new ArrayList<LabeledItem<T>>();

    public LabeledData(LabeledItem<T>... values) {
        addValues(values);
    }

    public String toJsonString() {
        JSONArray jsonArray = new JSONArray();
        for (LabeledItem<T> labeledItem : data) {
            JSONArray itemArray = new JSONArray();
            itemArray.put(labeledItem.getLabel());
            itemArray.put(labeledItem.getValue());
            jsonArray.put(itemArray);
        }
        return jsonArray.toString();
    }

    public Collection<LabeledItem<T>> getData() {
        return data;
    }
}
