package bakery.repositories;

import bakery.entities.tables.InsideTable;
import bakery.entities.tables.OutsideTable;
import bakery.entities.tables.interfaces.Table;
import bakery.repositories.interfaces.TableRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TableRepositoryImpl<T> implements TableRepository<Table> {
private Collection<Table> models;

    public TableRepositoryImpl() {
        this.models = new ArrayList<>();
    }

    @Override
    public Collection<Table> getAll() {

        return this.models;

//        return Collections.unmodifiableCollection(models);
    }

    @Override
    public void add(Table table) {
        this.models.add(table);
    }

    @Override
    public Table getByNumber(int number) {

        for (Table table : models) {
            if (table.getTableNumber() == number){
                return table;
            }
        }

//        for (Table table : models) {
//            if (table instanceof InsideTable) {
//                if (((InsideTable) table).getTableNumber() == number) {
//                    return table;
//                }
//            }
//            if (table instanceof OutsideTable) {
//                if (((OutsideTable) table).getTableNumber() == number) {
//                    return table;
//                }
//            }
//        }
        return null;
    }
}
