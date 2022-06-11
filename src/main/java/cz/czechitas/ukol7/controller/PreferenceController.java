package cz.czechitas.ukol7.controller;

import com.jgoodies.binding.PresentationModel;
import cz.czechitas.ukol7.formbuilder.ActionBuilder;
import cz.czechitas.ukol7.model.PreferenceBean;

import javax.swing.*;
import java.beans.PropertyChangeEvent;

public class PreferenceController {
    private final PresentationModel<PreferenceBean> model;
    private final Action ulozitAction;


    public PreferenceController(){
        model = new PresentationModel<>(new PreferenceBean());
        ulozitAction = ActionBuilder.create("&Uložit", this::handleUlozit);
        model.addBeanPropertyChangeListener(this::handlePropertyChange);
        vypoctiStavAkci();
    }

    public PresentationModel<PreferenceBean> getModel() {
        return model;
    }

    public Action getUlozitAction() {
        return ulozitAction;
    }

    private void handlePropertyChange(PropertyChangeEvent propertyChangeEvent) {
        vypoctiStavAkci();
    }

    private void vypoctiStavAkci() {
        if (model.getBean().getPrezdivka() != null && model.getBean().getOblibenaBarva() != null){
            ulozitAction.setEnabled(true);
        }
        else {
            ulozitAction.setEnabled(false);
        }
    }

    public void handleUlozit() {
        PreferenceBean bean = this.model.getBean();
        System.out.println("-- Ukládám preference barvy osoby --");
        System.out.println("Oblíbená barva osoby s přezdívkou " + bean.getPrezdivka() + " je " + bean.getOblibenaBarva().getText());
    }

}
