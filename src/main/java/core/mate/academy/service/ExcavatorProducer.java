package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public ExcavatorProducer() {
    }

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(3, 6));
        excavatorList.add(new Excavator(5, 2));
        excavatorList.add(new Excavator(8, 4));
        return excavatorList;
    }
}
