package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    public BulldozerProducer() {
    }

    @Override
    public List<Machine> get() {
        List<Machine> excavatorList = new ArrayList<>();
        excavatorList.add(new Bulldozer(37, 73));
        excavatorList.add(new Bulldozer(24, 42));
        excavatorList.add(new Bulldozer(41, 44));
        return excavatorList;
    }
}
