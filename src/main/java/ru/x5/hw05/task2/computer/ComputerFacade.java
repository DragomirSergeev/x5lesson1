package ru.x5.hw05.task2.computer;

import ru.x5.hw05.task2.computer.hardware.Monitor;
import ru.x5.hw05.task2.computer.hardware.Producers;
import ru.x5.hw05.task2.computer.hardware.graphic.AMDGraphicStrategy;
import ru.x5.hw05.task2.computer.hardware.graphic.GraphicsInstaller;
import ru.x5.hw05.task2.computer.hardware.graphic.GraphicsStrategy;
import ru.x5.hw05.task2.computer.hardware.graphic.IntelGraphicStrategy;
import ru.x5.hw05.task2.computer.hardware.hdd.HDDType;
import ru.x5.hw05.task2.computer.hardware.hdd.HDDfactory;
import ru.x5.hw05.task2.computer.hardware.hdd.HHDDFactory;
import ru.x5.hw05.task2.computer.hardware.hdd.SSDFactory;
import ru.x5.hw05.task2.computer.hardware.processor.GameProcessorStrategy;
import ru.x5.hw05.task2.computer.hardware.processor.ProcessorInstaller;
import ru.x5.hw05.task2.computer.hardware.processor.ProcessorStrategy;
import ru.x5.hw05.task2.computer.hardware.processor.ServerProcessorStrategy;
import ru.x5.hw05.task2.computer.hardware.ram.RAMFactory;
import ru.x5.hw05.task2.computer.hardware.ram.RAMServerFactory;
import ru.x5.hw05.task2.computer.hardware.ram.RAMType;
import ru.x5.hw05.task2.computer.hardware.ram.RAMslimFactory;

public class ComputerFacade {
    public Computer createComputer(HDDType typehdd, int graphicPower, RAMType ramType){
        Computer computer= new Computer();
        computer.setMonitor(new Monitor("Minimon", Producers.NVIDIA));

        HDDfactory hdDfactory;
        switch (typehdd){
            case HDD:hdDfactory=new HHDDFactory();
            break;
            case SSD:hdDfactory=new SSDFactory();
            break;
            default:hdDfactory=new HHDDFactory();
        }
        computer.setHdd(hdDfactory.createHDD());

        GraphicsInstaller graphicsInstaller = new GraphicsInstaller(computer);
        GraphicsStrategy graphicsStrategy;
        if(graphicPower>1000){
            graphicsStrategy=new AMDGraphicStrategy();
        }else{
            graphicsStrategy=new IntelGraphicStrategy();
        }
        graphicsInstaller.save(graphicsStrategy);

        ProcessorInstaller processorInstaller = new ProcessorInstaller(computer);
        ProcessorStrategy processorStrategy;
        if(computer.getGraphics().getRamValue()>2000){
            processorStrategy=new GameProcessorStrategy();
        }else{
            processorStrategy=new ServerProcessorStrategy();
        }
        processorInstaller.save(processorStrategy);

        RAMFactory ramFactory;
        if(computer.getGraphics().getRamValue()>1000){
            ramFactory=new RAMslimFactory();
        }else {
            ramFactory=new RAMServerFactory();
        }
        computer.setRam(ramFactory.getRam());

        return computer;
    }
}
