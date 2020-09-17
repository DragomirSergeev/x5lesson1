package ru.x5.hw05.task2.computer.hardware.hdd;

import ru.x5.hw05.task2.computer.hardware.Producers;

public class HDD {
    private Producers producer;
    private long mValue;
    private HDDType type;
    private FormType form;

    public Producers getProducer() {
        return producer;
    }

    public void setProducer(Producers producer) {
        this.producer = producer;
    }

    public long getmValue() {
        return mValue;
    }

    public void setmValue(long mValue) {
        this.mValue = mValue;
    }

    public HDDType getType() {
        return type;
    }

    public void setType(HDDType type) {
        this.type = type;
    }

    public FormType getForm() {
        return form;
    }

    public void setForm(FormType form) {
        this.form = form;
    }
}
