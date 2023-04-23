import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StorageFacility {

    HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        storageUnits = new HashMap<>();
    }

    public void add(String unit, String item) {
        storageUnits.putIfAbsent(unit, new ArrayList<>());
        this.storageUnits.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (storageUnits.get(storageUnit) == null) {
            return new ArrayList<>(0);
        }
        if (!storageUnits.containsKey(storageUnit)) {
            return new ArrayList<>(0);
        }
        return storageUnits.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (this.storageUnits.get(storageUnit).contains(item)) {
            this.storageUnits.get(storageUnit).remove(item);
        }
        if (this.storageUnits.get(storageUnit).isEmpty()) {
            this.storageUnits.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> temp = new ArrayList<>();
        for (String storageUnit : storageUnits.keySet()
        ) {
            if (storageUnit.isEmpty()) {

            } else {
                temp.add(storageUnit);
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return "StorageFacility{" +
                "storageUnits=" + storageUnits +
                '}';
    }
}
