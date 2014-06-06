/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import audio.AudioPlayer;
import environment.Environment;
import environment.Velocity;
import images.ResourceTools;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import map.Item;
import map.ItemEventHandlerIntf;
import map.Map;
import map.MapVisualizerDefault;
import map.Obstacle;
import map.ObstacleEventHandlerIntf;
import map.ObstacleType;
import map.Portal;
import map.PortalEventHandlerIntf;

/**
 *
 * @author kimberlygilson
 */
public class BrentwoodEnvironment extends Environment implements PortalEventHandlerIntf,
        ObstacleEventHandlerIntf, ItemEventHandlerIntf, ItemManagerResponseIntf,
        CombatResponseIntf, PlayerCustomizationIntf, MoveValidatorIntf {

//<editor-fold defaultstate="collapsed" desc="Properties">
    private Map currentMap;
    private Map bcampus;
    private Map ucampus;
    private Map dross;
    private Map uross;
    private Map mross;
    private Map marts;
    private Map darts;
    private Map mcafe;
    private Map dcafe;
    private Map lib;
    private Map classroom;
    private Map classroomtwo;
    private Map classroomthree;
    private Map classroomfour;
    private Map classroomfive;
    private Map classroomsix;
    private Map classroomseven;
    private Map classroomeight;
    private Map healthc;
    private Map gym;
    private Map adent;
    private Map ahent;
    private Map hdent;
    private Map hhent;
    private Map mdent;
    private Map mhent;
    private Map aldent;
    private Map alhent;
    private Map edent;
    private Map ehent;
    private Map pdent;
    private Map phent;
    private Map wdent;
    private Map whent;
    private Map rdent;
    private Map rhent;
    private Map office;
    private Map squash;
    private Map underit;
    private Map hid;
    private Map olaca;
    private Map mt;
    private Map adorm1;
    private Map adorm2;
    private Map adorm3;
    private Map aldorm1;
    private Map aldorm2;
    private Map aldorm3;
    private Map hdorm1;
    private Map hdorm2;
    private Map hdorm3;
    private Map mdorm1;
    private Map mdorm2;
    private Map mdorm3;
    private Map edorm1;
    private Map edorm2;
    private Map edorm3;
    private Map rdorm1;
    private Map rdorm2;
    private Map rdorm3;
    private Map wdorm1;
    private Map wdorm2;
    private Map wdorm3;
    private Map pdorm1;
    private Map pdorm2;
    private Map pdorm3;
    private Map olcafe;
    private MapVisualizerDefault mapVisualizer;

    private Hero hero;
    private Shaq shaq;
    private Snorlax snorlax;
    private Bull bull;
    private Image bullSprite;
    

    private CharacterProperty myProperty;
    private String myName = "player";
    private String typeOfCharacter = "snorlax";
//    private ArrayList<String> dialog;
    //defalt my Image
    private Image myImage = ResourceTools.loadImageFromResource("resources/snorlax_icon.jpg");
    private Image snorlax_icon = ResourceTools.loadImageFromResource("resources/snorlax_icon.jpg");
    private Image shaq_icon = ResourceTools.loadImageFromResource("resources/shaq_icon.jpg");
    private Image hero_icon = ResourceTools.loadImageFromResource("resources/hero_icon.jpg");
    private Image charmander_icon = ResourceTools.loadImageFromResource("resources/charmander_icon.jpg");
    private Image garvey = ResourceTools.loadImageFromResource("resources/garvey.jpg");
    private Image roommate = ResourceTools.loadImageFromResource("resources/roommate.JPG");
    private Image mais = ResourceTools.loadImageFromResource("resources/mais.jpg");
    private Image itGuy = ResourceTools.loadImageFromResource("resources/it_guy.jpg");
    private Image collis = ResourceTools.loadImageFromResource("resources/collis.jpg");

    /**
     * @return the bcampus
     */
    public Map getBcampus() {
        return bcampus;
    }

    /**
     * @param bcampus the bcampus to set
     */
    public void setBcampus(Map bcampus) {
        this.bcampus = bcampus;
        configureMap(this.bcampus);
    }

    /**
     * @return the ucampus
     */
    public Map getUcampus() {
        return ucampus;
    }

    /**
     * @param ucampus the ucampus to set
     */
    public void setUcampus(Map ucampus) {
        this.ucampus = ucampus;
        configureMap(this.ucampus);
    }

    /**
     * @return the dross
     */
    public Map getDross() {
        return dross;
    }

    /**
     * @param dross the dross to set
     */
    public void setDross(Map dross) {
        this.dross = dross;
        configureMap(this.dross);
    }

    /**
     * @return the currentMap
     */
    public Map getCurrentMap() {
        return currentMap;
    }
//</editor-fold>

    /**
     * @param map the Map to set
     */
    public void setCurrentMap(Map map) {
        currentMap = map;
        this.myProperty = new CharacterProperty();
//        mapVisualizer = new MapVisualizerDefault(true, false);
    }

    //<editor-fold defaultstate="collapsed" desc="Initialize Maps">    
    /**
     * @return the uross
     */
    public Map getUross() {
        return uross;
    }

    /**
     * @param uross the uross to set
     */
    public void setUross(Map uross) {
        this.uross = uross;
        configureMap(this.uross);
    }

    /**
     * @return the mross
     */
    public Map getMross() {
        return mross;
    }

    /**
     * @param mross the mross to set
     */
    public void setMross(Map mross) {
        this.mross = mross;
        configureMap(this.mross);
    }

    /**
     * @return the marts
     */
    public Map getMarts() {
        return marts;
    }

    /**
     * @param marts the marts to set
     */
    public void setMarts(Map marts) {
        this.marts = marts;
        configureMap(this.marts);
    }

    /**
     * @return the darts
     */
    public Map getDarts() {
        return darts;
    }

    /**
     * @param darts the darts to set
     */
    public void setDarts(Map darts) {
        this.darts = darts;
        configureMap(this.darts);
    }

    /**
     * @return the mcafe
     */
    public Map getMcafe() {
        return mcafe;
    }

    /**
     * @param mcafe the mcafe to set
     */
    public void setMcafe(Map mcafe) {
        this.mcafe = mcafe;
        configureMap(this.mcafe);
    }

    /**
     * @return the dcafe
     */
    public Map getDcafe() {
        return dcafe;
    }

    /**
     * @param dcafe the dcafe to set
     */
    public void setDcafe(Map dcafe) {
        this.dcafe = dcafe;
        configureMap(this.dcafe);
    }

    /**
     * @return the lib
     */
    public Map getLib() {
        return lib;
    }

    /**
     * @param lib the lib to set
     */
    public void setLib(Map lib) {
        this.lib = lib;
        configureMap(this.lib);

    }

    /**
     * @return the classroom
     */
    public Map getClassroom() {
        return classroom;
    }

    /**
     * @param classroom the classroom to set
     */
    public void setClassroom(Map classroom) {
        this.classroom = classroom;
        configureMap(this.classroom);

    }

    /**
     * @return the classroomtwo
     */
    public Map getClassroomtwo() {
        return classroomtwo;
    }

    /**
     * @param classroomtwo the classroomtwo to set
     */
    public void setClassroomtwo(Map classroomtwo) {
        this.classroomtwo = classroomtwo;
        configureMap(this.classroomtwo);

    }

    /**
     * @return the classroomthree
     */
    public Map getClassroomthree() {
        return classroomthree;
    }

    /**
     * @param classroomthree the classroomthree to set
     */
    public void setClassroomthree(Map classroomthree) {
        this.classroomthree = classroomthree;
        configureMap(this.classroomthree);

    }

    /**
     * @return the classroomfour
     */
    public Map getClassroomfour() {
        return classroomfour;

    }

    /**
     * @param classroomfour the classroomfour to set
     */
    public void setClassroomfour(Map classroomfour) {
        this.classroomfour = classroomfour;
        configureMap(this.classroomfour);

    }

    /**
     * @return the classroomfive
     */
    public Map getClassroomfive() {
        return classroomfive;
    }

    /**
     * @param classroomfive the classroomfive to set
     */
    public void setClassroomfive(Map classroomfive) {
        this.classroomfive = classroomfive;
        configureMap(this.classroomfive);

    }

    /**
     * @return the classroomsix
     */
    public Map getClassroomsix() {
        return classroomsix;
    }

    /**
     * @param classroomsix the classroomsix to set
     */
    public void setClassroomsix(Map classroomsix) {
        this.classroomsix = classroomsix;
        configureMap(this.classroomsix);

    }

    /**
     * @return the classroomseven
     */
    public Map getClassroomseven() {
        return classroomseven;
    }

    /**
     * @param classroomseven the classroomseven to set
     */
    public void setClassroomseven(Map classroomseven) {
        this.classroomseven = classroomseven;
        configureMap(this.classroomseven);

    }

    /**
     * @return the classroomeight
     */
    public Map getClassroomeight() {
        return classroomeight;
    }

    /**
     * @param classroomeight the classroomeight to set
     */
    public void setClassroomeight(Map classroomeight) {
        this.classroomeight = classroomeight;
        configureMap(this.classroomeight);

    }

    /**
     * @return the healthc
     */
    public Map getHealthc() {
        return healthc;
    }

    /**
     * @param healthc the healthc to set
     */
    public void setHealthc(Map healthc) {
        this.healthc = healthc;
        configureMap(this.healthc);

    }

    /**
     * @return the gym
     */
    public Map getGym() {
        return gym;
    }

    /**
     * @param gym the gym to set
     */
    public void setGym(Map gym) {
        this.gym = gym;
        configureMap(this.gym);

    }

    /**
     * @return the adent
     */
    public Map getAdent() {
        return adent;

    }

    /**
     * @param adent the adent to set
     */
    public void setAdent(Map adent) {
        this.adent = adent;
        configureMap(this.adent);

    }

    /**
     * @return the hdent
     */
    public Map getHdent() {
        return hdent;
    }

    /**
     * @param hdent the hdent to set
     */
    public void setHdent(Map hdent) {
        this.hdent = hdent;
        configureMap(this.hdent);

    }

    /**
     * @return the mdent
     */
    public Map getMdent() {
        return mdent;
    }

    /**
     * @param mdent the mdent to set
     */
    public void setMdent(Map mdent) {
        this.mdent = mdent;
        configureMap(this.mdent);

    }

    /**
     * @return the aldent
     */
    public Map getAldent() {
        return aldent;
    }

    /**
     * @param aldent the aldent to set
     */
    public void setAldent(Map aldent) {
        this.aldent = aldent;
        configureMap(this.aldent);

    }

    /**
     * @return the edent
     */
    public Map getEdent() {
        return edent;
    }

    /**
     * @param edent the edent to set
     */
    public void setEdent(Map edent) {
        this.edent = edent;
        configureMap(this.edent);

    }

    /**
     * @return the pdent
     */
    public Map getPdent() {
        return pdent;
    }

    /**
     * @param pdent the pdent to set
     */
    public void setPdent(Map pdent) {
        this.pdent = pdent;
        configureMap(this.pdent);

    }

    /**
     * @return the wdent
     */
    public Map getWdent() {
        return wdent;
    }

    /**
     * @param wdent the wdent to set
     */
    public void setWdent(Map wdent) {
        this.wdent = wdent;
        configureMap(this.wdent);

    }

    /**
     * @return the rdent
     */
    public Map getRdent() {
        return rdent;
    }

    /**
     * @param rdent the rdent to set
     */
    public void setRdent(Map rdent) {
        this.rdent = rdent;
        configureMap(this.rdent);

    }

    /**
     * @return the squash
     */
    public Map getSquash() {
        return squash;
    }

    /**
     * @param squash the squash to set
     */
    public void setSquash(Map squash) {
        this.squash = squash;
        configureMap(this.squash);

    }

    /**
     * @return the underit
     */
    public Map getUnderit() {
        return underit;
    }

    /**
     * @param underit the underit to set
     */
    public void setUnderit(Map underit) {
        this.underit = underit;
        configureMap(this.underit);

    }

    /**
     * @return the hid
     */
    public Map getHid() {
        return hid;
    }

    /**
     * @param hid the hid to set
     */
    public void setHid(Map hid) {
        this.hid = hid;
        configureMap(this.hid);

    }

    /**
     * @return the olaca
     */
    public Map getOlaca() {
        return olaca;
    }

    /**
     * @param olaca the olaca to set
     */
    public void setOlaca(Map olaca) {
        this.olaca = olaca;
        configureMap(this.olaca);

    }

    /**
     * @return the mt
     */
    public Map getMt() {
        return mt;
    }

    /**
     * @param mt the mt to set
     */
    public void setMt(Map mt) {
        this.mt = mt;
        configureMap(this.mt);

    }

    /**
     * @return the office
     */
    public Map getOffice() {
        return office;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(Map office) {
        this.office = office;
        configureMap(this.office);

    }

    /**
     * @return the ahent
     */
    public Map getAhent() {
        return ahent;

    }

    /**
     * @param ahent the ahent to set
     */
    public void setAhent(Map ahent) {
        this.ahent = ahent;
        configureMap(this.ahent);

    }

    /**
     * @return the hhent
     */
    public Map getHhent() {
        return hhent;
    }

    /**
     * @param hhent the hhent to set
     */
    public void setHhent(Map hhent) {
        this.hhent = hhent;
        configureMap(this.hhent);

    }

    /**
     * @return the mhent
     */
    public Map getMhent() {
        return mhent;
    }

    /**
     * @param mhent the mhent to set
     */
    public void setMhent(Map mhent) {
        this.mhent = mhent;
        configureMap(this.mhent);

    }

    /**
     * @return the alhent
     */
    public Map getAlhent() {
        return alhent;
    }

    /**
     * @param alhent the alhent to set
     */
    public void setAlhent(Map alhent) {
        this.alhent = alhent;
        configureMap(this.alhent);

    }

    /**
     * @return the ehent
     */
    public Map getEhent() {
        return ehent;
    }

    /**
     * @param ehent the ehent to set
     */
    public void setEhent(Map ehent) {
        this.ehent = ehent;
        configureMap(this.ehent);

    }

    /**
     * @return the phent
     */
    public Map getPhent() {
        return phent;

    }

    /**
     * @param phent the phent to set
     */
    public void setPhent(Map phent) {
        this.phent = phent;
        configureMap(this.phent);

    }

    /**
     * @return the whent
     */
    public Map getWhent() {
        return whent;
    }

    /**
     * @param whent the whent to set
     */
    public void setWhent(Map whent) {
        this.whent = whent;
        configureMap(this.whent);

    }

    /**
     * @return the rhent
     */
    public Map getRhent() {
        return rhent;
    }

    /**
     * @param rhent the rhent to set
     */
    public void setRhent(Map rhent) {
        this.rhent = rhent;
        configureMap(this.rhent);

    }

    /**
     * @return the adorm1
     */
    public Map getAdorm1() {
        return adorm1;
    }

    /**
     * @param adorm1 the adorm1 to set
     */
    public void setAdorm1(Map adorm1) {
        this.adorm1 = adorm1;
        configureMap(this.adorm1);

    }

    /**
     * @return the adorm2
     */
    public Map getAdorm2() {
        return adorm2;
    }

    /**
     * @param adorm2 the adorm2 to set
     */
    public void setAdorm2(Map adorm2) {
        this.adorm2 = adorm2;
        configureMap(this.adorm2);

    }

    /**
     * @return the adorm3
     */
    public Map getAdorm3() {
        return adorm3;
    }

    /**
     * @param adorm3 the adorm3 to set
     */
    public void setAdorm3(Map adorm3) {
        this.adorm3 = adorm3;
        configureMap(this.adorm3);

    }

    /**
     * @return the aldorm1
     */
    public Map getAldorm1() {
        return aldorm1;
    }

    /**
     * @param aldorm1 the aldorm1 to set
     */
    public void setAldorm1(Map aldorm1) {
        this.aldorm1 = aldorm1;
        configureMap(this.aldorm1);

    }

    /**
     * @return the aldorm2
     */
    public Map getAldorm2() {
        return aldorm2;
    }

    /**
     * @param aldorm2 the aldorm2 to set
     */
    public void setAldorm2(Map aldorm2) {
        this.aldorm2 = aldorm2;
        configureMap(this.aldorm2);

    }

    /**
     * @return the aldorm3
     */
    public Map getAldorm3() {
        return aldorm3;
    }

    /**
     * @param aldorm3 the aldorm3 to set
     */
    public void setAldorm3(Map aldorm3) {
        this.aldorm3 = aldorm3;
        configureMap(this.aldorm3);

    }

    /**
     * @return the hdorm1
     */
    public Map getHdorm1() {
        return hdorm1;
    }

    /**
     * @param hdorm1 the hdorm1 to set
     */
    public void setHdorm1(Map hdorm1) {
        this.hdorm1 = hdorm1;
        configureMap(this.hdorm1);

    }

    /**
     * @return the hdorm2
     */
    public Map getHdorm2() {
        return hdorm2;
    }

    /**
     * @param hdorm2 the hdorm2 to set
     */
    public void setHdorm2(Map hdorm2) {
        this.hdorm2 = hdorm2;
        configureMap(this.hdorm2);

    }

    /**
     * @return the hdorm3
     */
    public Map getHdorm3() {
        return hdorm3;
    }

    /**
     * @param hdorm3 the hdorm3 to set
     */
    public void setHdorm3(Map hdorm3) {
        this.hdorm3 = hdorm3;
        configureMap(this.hdorm3);

    }

    /**
     * @return the mdorm1
     */
    public Map getMdorm1() {
        return mdorm1;
    }

    /**
     * @param mdorm1 the mdorm1 to set
     */
    public void setMdorm1(Map mdorm1) {
        this.mdorm1 = mdorm1;
        configureMap(this.mdorm1);

    }

    /**
     * @return the mdorm2
     */
    public Map getMdorm2() {
        return mdorm2;
    }

    /**
     * @param mdorm2 the mdorm2 to set
     */
    public void setMdorm2(Map mdorm2) {
        this.mdorm2 = mdorm2;
        configureMap(this.mdorm2);

    }

    /**
     * @return the mdorm3
     */
    public Map getMdorm3() {
        return mdorm3;
    }

    /**
     * @param mdorm3 the mdorm3 to set
     */
    public void setMdorm3(Map mdorm3) {
        this.mdorm3 = mdorm3;
        configureMap(this.mdorm3);
    }

    /**
     * @return the edorm1
     */
    public Map getEdorm1() {
        return edorm1;
    }

    /**
     * @param edorm1 the edorm1 to set
     */
    public void setEdorm1(Map edorm1) {
        this.edorm1 = edorm1;
        configureMap(this.edorm1);

    }

    /**
     * @return the edorm2
     */
    public Map getEdorm2() {
        return edorm2;
    }

    /**
     * @param edorm2 the edorm2 to set
     */
    public void setEdorm2(Map edorm2) {
        this.edorm2 = edorm2;
        configureMap(this.edorm2);

    }

    /**
     * @return the edorm3
     */
    public Map getEdorm3() {
        return edorm3;
    }

    /**
     * @param edorm3 the edorm3 to set
     */
    public void setEdorm3(Map edorm3) {
        this.edorm3 = edorm3;
        configureMap(this.edorm3);

    }

    /**
     * @return the rdorm1
     */
    public Map getRdorm1() {
        return rdorm1;
    }

    /**
     * @param rdorm1 the rdorm1 to set
     */
    public void setRdorm1(Map rdorm1) {
        this.rdorm1 = rdorm1;
        configureMap(this.rdorm1);

    }

    /**
     * @return the rdorm2
     */
    public Map getRdorm2() {
        return rdorm2;
    }

    /**
     * @param rdorm2 the rdorm2 to set
     */
    public void setRdorm2(Map rdorm2) {
        this.rdorm2 = rdorm2;
        configureMap(this.rdorm2);

    }

    /**
     * @return the rdorm3
     */
    public Map getRdorm3() {
        return rdorm3;
    }

    /**
     * @param rdorm3 the rdorm3 to set
     */
    public void setRdorm3(Map rdorm3) {
        this.rdorm3 = rdorm3;
        configureMap(this.rdorm3);

    }

    /**
     * @return the wdorm1
     */
    public Map getWdorm1() {
        return wdorm1;
    }

    /**
     * @param wdorm1 the wdorm1 to set
     */
    public void setWdorm1(Map wdorm1) {
        this.wdorm1 = wdorm1;
        configureMap(this.wdorm1);

    }

    /**
     * @return the wdorm2
     */
    public Map getWdorm2() {
        return wdorm2;
    }

    /**
     * @param wdorm2 the wdorm2 to set
     */
    public void setWdorm2(Map wdorm2) {
        this.wdorm2 = wdorm2;
        configureMap(this.wdorm2);

    }

    /**
     * @return the wdorm3
     */
    public Map getWdorm3() {
        return wdorm3;
    }

    /**
     * @param wdorm3 the wdorm3 to set
     */
    public void setWdorm3(Map wdorm3) {
        this.wdorm3 = wdorm3;
        configureMap(this.wdorm3);

    }

    /**
     * @return the pdorm1
     */
    public Map getPdorm1() {
        return pdorm1;
    }

    /**
     * @param pdorm1 the pdorm1 to set
     */
    public void setPdorm1(Map pdorm1) {
        this.pdorm1 = pdorm1;
        configureMap(this.pdorm1);

    }

    /**
     * @return the pdorm2
     */
    public Map getPdorm2() {
        return pdorm2;
    }

    /**
     * @param pdorm2 the pdorm2 to set
     */
    public void setPdorm2(Map pdorm2) {
        this.pdorm2 = pdorm2;
        configureMap(this.pdorm2);

    }

    /**
     * @return the pdorm3
     */
    public Map getPdorm3() {
        return pdorm3;
    }

    /**
     * @param pdorm3 the pdorm3 to set
     */
    public void setPdorm3(Map pdorm3) {
        this.pdorm3 = pdorm3;
        configureMap(this.pdorm3);

    }

    /**
     * @return the olcafe
     */
    public Map getOlcafe() {
        return olcafe;
    }

    /**
     * @param olcafe the olcafe to set
     */
    public void setOlcafe(Map olcafe) {
        this.olcafe = olcafe;
        configureMap(this.olcafe);
    }

//</editor-fold>
    {
        mapVisualizer = new MapVisualizerDefault(true, false);

        setBcampus(MapBin.getCampusBottomMap());
        setUcampus(MapBin.getCampusUpperMap());
        setDross(MapBin.getDownSRossMap());
        setUross(MapBin.getUpperSRossMap());
        setMross(MapBin.getMainSRossMap());
        setMarts(MapBin.getMainArtsMap());
        setDarts(MapBin.getDownArtsMap());
        setMcafe(MapBin.getMainCafeMap());
        setDcafe(MapBin.getDownCafeMap());
        setLib(MapBin.getLibraryMap());
        setClassroom(MapBin.getClassroom1Map());
        setClassroomtwo(MapBin.getClassroom2Map());
        setClassroomthree(MapBin.getClassroom3Map());
        setClassroomfour(MapBin.getClassroom4Map());
        setClassroomfive(MapBin.getClassroom5Map());
        setClassroomsix(MapBin.getClassroom6Map());
        setClassroomseven(MapBin.getClassroom7Map());
        setClassroomeight(MapBin.getClassroom8Map());
        setHealthc(MapBin.getHealthCentreMap());
        setGym(MapBin.getGymMap());
        setHdent(MapBin.getHopeEntranceMap());
        setHhent(MapBin.getHopeHallwayMap());
        setAdent(MapBin.getAlexEntranceMap());
        setAhent(MapBin.getAlexHallwayMap());
        setAldent(MapBin.getAllardEntranceMap());
        setAlhent(MapBin.getAllardHallwayMap());
        setMdent(MapBin.getMackEntranceMap());
        setMhent(MapBin.getMackHallwayMap());
        setEdent(MapBin.getEllisEntranceMap());
        setEhent(MapBin.getEllisHallwayMap());
        setRdent(MapBin.getRogersEntranceMap());
        setRhent(MapBin.getRogersHallwayMap());
        setPdent(MapBin.getPrivettEntranceMap());
        setPhent(MapBin.getPrivettHallwayMap());
        setWdent(MapBin.getWhittalEntranceMap());
        setWhent(MapBin.getWhittalHallwayMap());
        setSquash(MapBin.getSquashGymMap());
        setUnderit(MapBin.getITMap());
        setHid(MapBin.getHiddenMap());
        setOlaca(MapBin.getOldBuildingMap());
        setMt(MapBin.getMTMap());
        setOffice(MapBin.getOfficeMap());
        setAdorm1(MapBin.getDorm1AlexMap());
        setAdorm2(MapBin.getDorm2AlexMap());
        setAdorm3(MapBin.getDorm3AlexMap());
        setAldorm1(MapBin.getDorm1AllardMap());
        setAldorm2(MapBin.getDorm2AllardMap());
        setAldorm3(MapBin.getDorm3AllardMap());
        setHdorm1(MapBin.getDorm1HopeMap());
        setHdorm2(MapBin.getDorm2HopeMap());
        setHdorm3(MapBin.getDorm2HopeMap());
        setMdorm1(MapBin.getDorm1MackMap());
        setMdorm2(MapBin.getDorm2MackMap());
        setMdorm3(MapBin.getDorm3MackMap());
        setEdorm1(MapBin.getDorm1EllisMap());
        setEdorm2(MapBin.getDorm2EllisMap());
        setEdorm3(MapBin.getDorm3EllisMap());
        setRdorm1(MapBin.getDorm1RogersMap());
        setRdorm2(MapBin.getDorm2RogersMap());
        setRdorm3(MapBin.getDorm3RogersMap());
        setWdorm1(MapBin.getDorm1WhittalMap());
        setWdorm2(MapBin.getDorm2WhittalMap());
        setWdorm3(MapBin.getDorm3WhittalMap());
        setPdorm1(MapBin.getDorm1PrivettMap());
        setPdorm2(MapBin.getDorm2PrivettMap());
        setPdorm3(MapBin.getDorm3PrivettMap());
        setOlcafe(MapBin.getOldCafeMap());

        //ross
        Map.addPortal(bcampus, new Point(30, 19), mross, new Point(9, 9));
        Map.addPortal(mross, new Point(9, 8), bcampus, new Point(30, 19));
        Map.addPortal(mross, new Point(5, 8), bcampus, new Point(30, 19));
        Map.addPortal(mross, new Point(1, 7), dross, new Point(1, 6));
        Map.addPortal(dross, new Point(1, 6), mross, new Point(1, 7));
        Map.addPortal(mross, new Point(1, 4), uross, new Point(1, 6));
        Map.addPortal(uross, new Point(1, 6), mross, new Point(1, 4));
        Map.addPortal(uross, new Point(5, 3), classroom, new Point(3, 8));
        Map.addPortal(uross, new Point(9, 3), classroomtwo, new Point(3, 8));
        Map.addPortal(classroom, new Point(3, 8), uross, new Point(5, 3));
        Map.addPortal(classroomtwo, new Point(3, 8), uross, new Point(9, 3));
        Map.addPortal(uross, new Point(5, 9), classroomthree, new Point(3, 8));
        Map.addPortal(uross, new Point(9, 9), classroomfour, new Point(3, 8));
        Map.addPortal(classroomthree, new Point(3, 8), uross, new Point(5, 9));
        Map.addPortal(classroomfour, new Point(3, 8), uross, new Point(9, 9));
        Map.addPortal(dross, new Point(5, 3), classroomfive, new Point(3, 8));
        Map.addPortal(dross, new Point(9, 3), classroomsix, new Point(3, 8));
        Map.addPortal(classroomfive, new Point(3, 8), dross, new Point(5, 3));
        Map.addPortal(classroomsix, new Point(3, 8), dross, new Point(9, 3));
        Map.addPortal(dross, new Point(5, 9), classroomseven, new Point(3, 8));
        Map.addPortal(dross, new Point(9, 9), classroomeight, new Point(3, 8));
        Map.addPortal(classroomseven, new Point(3, 8), dross, new Point(5, 9));
        Map.addPortal(classroomeight, new Point(3, 8), dross, new Point(9, 9));
        Map.addPortal(mross, new Point(9, 3), lib, new Point(4, 8));
        Map.addPortal(lib, new Point(4, 8), mross, new Point(9, 3));
        Map.addPortal(mross, new Point(5, 3), office, new Point(6, 12));
        Map.addPortal(office, new Point(6, 12), mross, new Point(5, 3));

        //5,3  9,3
        //arts build
        Map.addPortal(bcampus, new Point(21, 22), marts, new Point(28, 12));
        Map.addPortal(marts, new Point(28, 12), bcampus, new Point(21, 22));
        Map.addPortal(marts, new Point(28, 13), bcampus, new Point(21, 22));
        Map.addPortal(marts, new Point(14, 13), darts, new Point(23, 12));
        Map.addPortal(marts, new Point(14, 14), darts, new Point(23, 12));
        Map.addPortal(darts, new Point(23, 12), marts, new Point(14, 13));

        //cafe build
        Map.addPortal(bcampus, new Point(7, 21), mcafe, new Point(3, 1));
        Map.addPortal(bcampus, new Point(8, 21), mcafe, new Point(3, 1));
        Map.addPortal(mcafe, new Point(3, 1), bcampus, new Point(7, 21));
        Map.addPortal(mcafe, new Point(1, 2), dcafe, new Point(1, 2));
        Map.addPortal(dcafe, new Point(1, 2), mcafe, new Point(1, 2));

        //campus
        Map.addPortal(bcampus, new Point(37, 0), ucampus, new Point(25, 34));
        Map.addPortal(bcampus, new Point(36, 0), ucampus, new Point(24, 34));
        Map.addPortal(ucampus, new Point(24, 34), bcampus, new Point(36, 0));
        Map.addPortal(ucampus, new Point(25, 34), bcampus, new Point(37, 0));

        //health centre
        Map.addPortal(bcampus, new Point(55, 15), healthc, new Point(14, 9));
        Map.addPortal(healthc, new Point(14, 9), bcampus, new Point(55, 15));

        //gym
        Map.addPortal(bcampus, new Point(60, 17), gym, new Point(7, 11));
        Map.addPortal(gym, new Point(7, 11), bcampus, new Point(60, 17));
        Map.addPortal(gym, new Point(6, 11), bcampus, new Point(60, 17));
        Map.addPortal(gym, new Point(8, 11), bcampus, new Point(60, 17));
        Map.addPortal(gym, new Point(1, 8), squash, new Point(19, 4));
        Map.addPortal(squash, new Point(19, 4), gym, new Point(1, 8));

        //allard
        Map.addPortal(bcampus, new Point(19, 7), aldent, new Point(7, 21));
        Map.addPortal(aldent, new Point(7, 21), bcampus, new Point(19, 7));
        Map.addPortal(aldent, new Point(7, 22), bcampus, new Point(19, 7));
        Map.addPortal(aldent, new Point(14, 5), alhent, new Point(2, 4));
        Map.addPortal(alhent, new Point(2, 4), aldent, new Point(14, 5));
        Map.addPortal(alhent, new Point(4, 1), aldorm1, new Point(10, 1));
        Map.addPortal(alhent, new Point(7, 1), aldorm2, new Point(10, 1));
        Map.addPortal(alhent, new Point(10, 1), aldorm3, new Point(10, 1));
        Map.addPortal(aldorm1, new Point(10, 1), alhent, new Point(4, 1));
        Map.addPortal(aldorm2, new Point(10, 1), alhent, new Point(7, 1));
        Map.addPortal(aldorm3, new Point(10, 1), alhent, new Point(10, 1));

        //alex
        Map.addPortal(bcampus, new Point(42, 12), adent, new Point(7, 21));
        Map.addPortal(bcampus, new Point(43, 12), adent, new Point(7, 21));
        Map.addPortal(adent, new Point(7, 21), bcampus, new Point(42, 12));
        Map.addPortal(adent, new Point(7, 22), bcampus, new Point(42, 12));
        Map.addPortal(adent, new Point(14, 5), ahent, new Point(2, 4));
        Map.addPortal(ahent, new Point(2, 4), adent, new Point(14, 5));
        Map.addPortal(ahent, new Point(4, 1), adorm1, new Point(10, 1));
        Map.addPortal(ahent, new Point(7, 1), adorm2, new Point(10, 1));
        Map.addPortal(ahent, new Point(10, 1), adorm3, new Point(10, 1));
        Map.addPortal(adorm1, new Point(10, 1), ahent, new Point(4, 1));
        Map.addPortal(adorm2, new Point(10, 1), ahent, new Point(7, 1));
        Map.addPortal(adorm3, new Point(10, 1), ahent, new Point(10, 1));

        //mack
        Map.addPortal(bcampus, new Point(34, 6), mdent, new Point(7, 21));
        Map.addPortal(mdent, new Point(7, 21), bcampus, new Point(34, 6));
        Map.addPortal(mdent, new Point(7, 22), bcampus, new Point(34, 6));
        Map.addPortal(mdent, new Point(14, 5), mhent, new Point(2, 4));
        Map.addPortal(mhent, new Point(2, 4), mdent, new Point(14, 5));
        Map.addPortal(mhent, new Point(4, 1), mdorm1, new Point(10, 1));
        Map.addPortal(mhent, new Point(7, 1), mdorm2, new Point(10, 1));
        Map.addPortal(mhent, new Point(10, 1), mdorm3, new Point(10, 1));
        Map.addPortal(mdorm1, new Point(10, 1), mhent, new Point(4, 1));
        Map.addPortal(mdorm2, new Point(10, 1), mhent, new Point(7, 1));
        Map.addPortal(mdorm3, new Point(10, 1), mhent, new Point(10, 1));

        //hope
        Map.addPortal(ucampus, new Point(45, 33), hdent, new Point(7, 21));
        Map.addPortal(hdent, new Point(7, 21), ucampus, new Point(45, 33));
        Map.addPortal(hdent, new Point(7, 22), ucampus, new Point(45, 33));
        Map.addPortal(hdent, new Point(14, 5), hhent, new Point(2, 4));
        Map.addPortal(hhent, new Point(2, 4), hdent, new Point(14, 5));
        Map.addPortal(hhent, new Point(4, 1), hdorm1, new Point(10, 1));
        Map.addPortal(hhent, new Point(7, 1), hdorm2, new Point(10, 1));
        Map.addPortal(hhent, new Point(10, 1), hdorm3, new Point(10, 1));
        Map.addPortal(hdorm1, new Point(10, 1), hhent, new Point(4, 1));
        Map.addPortal(hdorm2, new Point(10, 1), hhent, new Point(7, 1));
        Map.addPortal(hdorm3, new Point(10, 1), hhent, new Point(10, 1));

        //rogers
        Map.addPortal(ucampus, new Point(38, 33), rdent, new Point(7, 21));
        Map.addPortal(rdent, new Point(7, 21), ucampus, new Point(38, 33));
        Map.addPortal(rdent, new Point(7, 22), ucampus, new Point(38, 33));
        Map.addPortal(rdent, new Point(14, 5), rhent, new Point(2, 4));
        Map.addPortal(rhent, new Point(2, 4), rdent, new Point(14, 5));
        Map.addPortal(rhent, new Point(4, 1), rdorm1, new Point(10, 1));
        Map.addPortal(rhent, new Point(7, 1), rdorm2, new Point(10, 1));
        Map.addPortal(rhent, new Point(10, 1), rdorm3, new Point(10, 1));
        Map.addPortal(rdorm1, new Point(10, 1), rhent, new Point(4, 1));
        Map.addPortal(rdorm2, new Point(10, 1), rhent, new Point(7, 1));
        Map.addPortal(rdorm3, new Point(10, 1), rhent, new Point(10, 1));

        //ellis
        Map.addPortal(ucampus, new Point(59, 33), edent, new Point(7, 21));
        Map.addPortal(ucampus, new Point(58, 33), edent, new Point(7, 21));
        Map.addPortal(edent, new Point(7, 21), ucampus, new Point(59, 33));
        Map.addPortal(edent, new Point(7, 22), ucampus, new Point(58, 33));
        Map.addPortal(edent, new Point(14, 5), ehent, new Point(2, 4));
        Map.addPortal(ehent, new Point(2, 4), edent, new Point(14, 5));
        Map.addPortal(ehent, new Point(4, 1), edorm1, new Point(10, 1));
        Map.addPortal(ehent, new Point(7, 1), edorm2, new Point(10, 1));
        Map.addPortal(ehent, new Point(10, 1), edorm3, new Point(10, 1));
        Map.addPortal(edorm1, new Point(10, 1), ehent, new Point(4, 1));
        Map.addPortal(edorm2, new Point(10, 1), ehent, new Point(7, 1));
        Map.addPortal(edorm3, new Point(10, 1), ehent, new Point(10, 1));

// validate these, please!
        Map.addPortal(getBcampus(), new Point(30, 19), getDross(), new Point(9, 9));

        Map.addPortal(getDross(), new Point(9, 9), getBcampus(), new Point(30, 19));
        Map.addPortal(getDross(), new Point(5, 9), getBcampus(), new Point(30, 19));

        Map.addPortal(getBcampus(), new Point(37, 0), getUcampus(), new Point(25, 34));
        Map.addPortal(getBcampus(), new Point(36, 0), getUcampus(), new Point(24, 34));
        Map.addPortal(getUcampus(), new Point(24, 34), getBcampus(), new Point(36, 0));
        Map.addPortal(getUcampus(), new Point(25, 34), getBcampus(), new Point(37, 0));
// stop validating!

        //whittal
        Map.addPortal(bcampus, new Point(49, 9), wdent, new Point(7, 21));
        Map.addPortal(wdent, new Point(14, 9), bcampus, new Point(49, 9));
        Map.addPortal(edent, new Point(7, 22), bcampus, new Point(49, 9));
        Map.addPortal(wdent, new Point(14, 5), whent, new Point(2, 4));
        Map.addPortal(whent, new Point(2, 4), wdent, new Point(14, 5));
        Map.addPortal(whent, new Point(4, 1), wdorm1, new Point(10, 1));
        Map.addPortal(whent, new Point(7, 1), wdorm2, new Point(10, 1));
        Map.addPortal(whent, new Point(10, 1), wdorm3, new Point(10, 1));
        Map.addPortal(wdorm1, new Point(10, 1), whent, new Point(4, 1));
        Map.addPortal(wdorm2, new Point(10, 1), whent, new Point(7, 1));
        Map.addPortal(wdorm3, new Point(10, 1), whent, new Point(10, 1));

        //privett
        Map.addPortal(bcampus, new Point(61, 5), pdent, new Point(7, 21));
        Map.addPortal(pdent, new Point(7, 21), bcampus, new Point(61, 5));
        Map.addPortal(edent, new Point(7, 22), bcampus, new Point(61, 5));
        Map.addPortal(pdent, new Point(14, 5), phent, new Point(2, 4));
        Map.addPortal(phent, new Point(2, 4), pdent, new Point(14, 5));
        Map.addPortal(phent, new Point(4, 1), pdorm1, new Point(10, 1));
        Map.addPortal(phent, new Point(7, 1), pdorm2, new Point(10, 1));
        Map.addPortal(phent, new Point(10, 1), pdorm3, new Point(10, 1));
        Map.addPortal(pdorm1, new Point(10, 1), phent, new Point(4, 1));
        Map.addPortal(pdorm2, new Point(10, 1), phent, new Point(7, 1));
        Map.addPortal(pdorm3, new Point(10, 1), phent, new Point(10, 1));

        //mt
        Map.addPortal(bcampus, new Point(63, 20), mt, new Point(0, 8));
        Map.addPortal(mt, new Point(0, 8), bcampus, new Point(63, 20));
        Map.addPortal(mt, new Point(0, 9), bcampus, new Point(63, 20));

        //it
        Map.addPortal(olaca, new Point(3, 13), underit, new Point(2, 0));
        Map.addPortal(underit, new Point(2, 0), olaca, new Point(3, 13));
        Map.addPortal(underit, new Point(48, 12), bcampus, new Point(63, 23));
        Map.addPortal(bcampus, new Point(64, 13), underit, new Point(48, 12));

        //ol academic
        Map.addPortal(bcampus, new Point(47, 25), olaca, new Point(8, 34));
        Map.addPortal(olaca, new Point(8, 34), bcampus, new Point(47, 25));

        //olcafe
        Map.addPortal(bcampus, new Point(52, 25), olcafe, new Point(3, 1));
        Map.addPortal(olcafe, new Point(3, 1), bcampus, new Point(52, 25));

        //hidden
        Map.addPortal(bcampus, new Point(2, 1), hid, new Point(11, 19));
        Map.addPortal(hid, new Point(11, 19), bcampus, new Point(2, 1));
        Map.addPortal(hid, new Point(10, 19), bcampus, new Point(2, 1));
        Map.addPortal(hid, new Point(13, 19), bcampus, new Point(2, 1));
        setCurrentMap(getBcampus());

        this.bullSprite = (BufferedImage) ResourceTools.loadImageFromResource("resources/pokemon.png");
    }

    public BrentwoodEnvironment() {
        super();
    }

    private void configureMap(Map map) {
        map.setMapVisualizer(mapVisualizer);
        map.setPortalEventHandler(this);
        map.setObstacleEventHandler(this);
        map.setItemEventHandler(this);
    }

    public BrentwoodEnvironment(Image background) {
        super(background);
    }

    @Override
    public void initializeEnvironment() {
        loadCharacters();
    }

    private void loadCharacters() {
        if (this.typeOfCharacter == "snorlax") {
            hero = new Hero(new Point(-1, -1), new Velocity(0, 0));
            getActors().add(hero);

            shaq = new Shaq(new Point(-1, -1), new Velocity(0, 0));
            getActors().add(shaq);

            snorlax = new Snorlax(new Point(700, 150), new Velocity(0, 0));
            getActors().add(snorlax);
        } else {

            hero = new Hero(new Point(700, 50), new Velocity(0, 0));
            getActors().add(hero);

            shaq = new Shaq(new Point(300, 100), new Velocity(0, 0));
            shaq.setMoveValidator(this);
            getActors().add(shaq);

            snorlax = new Snorlax(new Point(700, 150), new Velocity(0, 0));
            getActors().add(snorlax);

            bull = new Bull(new Point(700, 200), new Velocity(0, 0));
            getActors().add(bull);
        }
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.isControlDown()) {
            if (e.getKeyCode() == KeyEvent.VK_E) {
                mapVisualizer.toggleShowAllObjects();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            hero.setState(State.STOP);
            snorlax.setState(State.STOP);
            shaq.setState(State.STOP);
            bull.setState(State.STOP);

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.setState(State.FRONT_WALK);
            snorlax.setState(State.FRONT_WALK);
            bull.setState(State.FRONT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.setState(State.BACK_WALK);
            snorlax.setState(State.BACK_WALK);
            bull.setState(State.BACK_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.setState(State.RIGHT_WALK);
            snorlax.setState(State.RIGHT_WALK);
            bull.setState(State.RIGHT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.setState(State.LEFT_WALK);
            snorlax.setState(State.LEFT_WALK);
            bull.setState(State.LEFT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            hero.setState(State.STAND);
            snorlax.setState(State.STAND);
            bull.setState(State.STAND);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            shaq.setState(State.FRONT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            shaq.setState(State.BACK_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            shaq.setState(State.RIGHT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            shaq.setState(State.LEFT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_1) {
//            showPlayerCustomization();  
//            showCombat();
        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        if (e.isControlDown()) {
            getCurrentMap().validateLocation(getCurrentMap().getCellLocation(e.getPoint()));
        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (getCurrentMap() != null) {
            getCurrentMap().drawMap(graphics);
        }

//        if (this.bullSprite != null) {
//            graphics.drawImage(bullSprite, WIDTH, WIDTH, this);
//         }
    }

//<editor-fold defaultstate="collapsed" desc="Dialogs">
    private void showCombat() {
        JFrame frmCombat = new JFrame("Combat");
        Combat myCombat = new Combat(myName, myImage, charmander_icon, myProperty.getMyHp(), myProperty.getMyDamage(), this);

        frmCombat.add(myCombat);
        frmCombat.setAlwaysOnTop(true);
        frmCombat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCombat.setSize(new Dimension(600, 400));

        frmCombat.setVisible(true);
    }

    private void showDialog() {
        JFrame frmDialog = new JFrame("Dialog");

        ArrayList<String> conversation = new ArrayList<>();

        conversation.add(this.myName + ", it's time for class. We should go.");
        conversation.add("OK. What class do we have?");
        conversation.add("We have different schedule...You should go ask our house parent. She is downstairs.");
//        conversation.add("Welcome to Brentwood College School! Start your advanture and become the best student.");
//        conversation.add("OK. Where should I start?");
//        conversation.add("Go find your house parent in the common room.");

        Dialog myDialog = new Dialog(myName, "Roommate", myImage, roommate, conversation);

        frmDialog.add(myDialog);
        frmDialog.setAlwaysOnTop(true);
        frmDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmDialog.setSize(new Dimension(600, 425));
        frmDialog.setVisible(true);
    }

    private void showDialogHP() {
        JFrame frmDialog = new JFrame("Dialog with House Parent");

        ArrayList<String> conversation = new ArrayList<>();

        conversation.clear();
        conversation.add("Good morning, " + this.myName + ".");
        conversation.add("Good morning Mrs. Mais! I don't know which class should I go to. Can you help me?");
        conversation.add("You can check your schedule on SDS: https://sds.brentwood.bc.ca/. Use your Brentwood account to login. It's the same for your Brentwood email.");
        conversation.add("OK...But I forgot my account.");
        conversation.add("Oh well, you can ask IT about it. It's in the old academic building. Be quick, you are going to be late for class.");

        Dialog myDialog = new Dialog(myName, "Mrs. Mais", myImage, mais, conversation);

        frmDialog.add(myDialog);
        frmDialog.setAlwaysOnTop(true);
        frmDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmDialog.setSize(new Dimension(600, 425));
        frmDialog.setVisible(true);
    }

    private void showDialogIT() {
        JFrame frmDialog = new JFrame("Dialog with the IT");

        ArrayList<String> conversation = new ArrayList<>();

        conversation.clear();
        conversation.add("...How can I help you?");
        conversation.add("Hi. I forgot my Brentwood account. My name is " + this.myName + ".");
        conversation.add("Here. Don't lose it again.");
        conversation.add("Looks like I should go to English class. Where is this R301?");
        conversation.add("Upstairs Ross Building, next to the stairs. Bye.");

        Dialog myDialog = new Dialog(myName, "IT faculty", myImage, itGuy, conversation);

        frmDialog.add(myDialog);
        frmDialog.setAlwaysOnTop(true);
        frmDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmDialog.setSize(new Dimension(600, 425));
        frmDialog.setVisible(true);
    }

    private void showDialogEnglishClass() {
        JFrame frmDialog = new JFrame("Dialog with English teacher");

        ArrayList<String> conversation = new ArrayList<>();

        conversation.clear();
        conversation.add("YO, what's your name? I'm Mr. Collis.");
        conversation.add("I'm" + this.myName + ". Sorry I'm late.");
        conversation.add("It's OK~ It's hard to find these classrooms, hey? Go have a seat. In this course, we are going to learn about Shakespear...");
        conversation.add("(after class) Thank you Mr. Collis! Oh, by the way, where is R308? I have Math class next.");
        conversation.add("Go out this door, turn right, walk straight, on your left. See you later, have a good day.");

        Dialog myDialog = new Dialog(myName, "Mr. Collis", myImage, collis, conversation);

        frmDialog.add(myDialog);
        frmDialog.setAlwaysOnTop(true);
        frmDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmDialog.setSize(new Dimension(600, 425));
        frmDialog.setVisible(true);
    }

    private void showItemManager() {
        JFrame frmItemManager = new JFrame("Item Manager");

        ContainerItemList containerItemList = new ContainerItemList();
        containerItemList.getItems().add(new ContainerItem("Pencil", "HB pencil, good for scantron."));
        ContainerItemManager itemManager = new ContainerItemManager("Treasure Box", containerItemList, this);

        frmItemManager.add(itemManager);
        frmItemManager.setAlwaysOnTop(true);
        frmItemManager.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmItemManager.setSize(new Dimension(400, 500));

        frmItemManager.setVisible(true);
    }

    private void showPlayerCustomization() {
        JFrame frmPlayerCustomization = new JFrame("PlayerCustomization");

        PlayerCustomization myPlayerCustomization = new PlayerCustomization(snorlax_icon, shaq_icon, hero_icon, this);

        frmPlayerCustomization.add(myPlayerCustomization);
        frmPlayerCustomization.setAlwaysOnTop(true);
        frmPlayerCustomization.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmPlayerCustomization.setSize(new Dimension(600, 400));
        frmPlayerCustomization.setVisible(true);
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="ItemEventHandlerIntf Interface Methods">
    @Override
    public boolean itemEvent(Item item) {
        //treasure box
        if ("TB".equals(item.getType())) {
            showItemManager();
        } else if ("Combat".equals(item.getType())) {
            showCombat();
        } else if ("Dialog".equals(item.getType())) {
            showDialog();
        } else if ("DialogHP".equals(item.getType())) {
            showDialogHP();
        } else if ("DialogIT".equals(item.getType())) {
            showDialogIT();
        } else if ("DialogEnglishClass".equals(item.getType())) {
            showDialogEnglishClass();
        }

        System.out.println("Item " + item.getLocation() + " " + item.getType());
        return true;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="ItemManagerResponseIntf Inteface Methods">
    @Override
    public void handleItemManagerResponse(ContainerItemList itemList) {
        System.out.println("IM Response");
        for (ContainerItem item : itemList.getItems()) {
            System.out.println(item.getDisplay());
        }
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="PortalEventHandlerIntf Interface Methods">
    @Override
    public boolean portalEvent(Portal portal) {
        setCurrentMap(portal.getDestinationMap());
//        portal.getDestinationMap().ge
        return true;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="ObstacleEventHandlerIntf Interface Methods">
    @Override
    public boolean obstacleEvent(Obstacle obstacle) {
        System.out.println("Obstacle " + obstacle.getLocation() + " " + obstacle.getType());
        if (obstacle.getType() == ObstacleType.WATER) {
            AudioPlayer.play("/resources/water.wav");
        }
        return false;
    }
//</editor-fold>

    @Override
    public void handleCombatResponse(boolean combatResult) {
        System.out.println("myHp = " + myProperty.getMyHp());
        System.out.println("myDamge = " + myProperty.getMyDamage());
        System.out.println("myLevel = " + myProperty.getMyLevel());
        System.out.println("myExp = " + myProperty.getMyExp());

        System.out.println("Combat Result " + combatResult);
        if (combatResult == true) {
            this.myProperty.addToMyExp(2);
            showItemManager();
        }
        System.out.println("exp = " + myProperty.getMyExp());
    }

    @Override
    public void handlePlayerCustomizationResponse(String myName, Image myImage, String type) {
        System.out.println("My name: " + myName);
        this.myName = myName;
        this.myImage = myImage;
        this.typeOfCharacter = type;
    }

//<editor-fold defaultstate="collapsed" desc="MoveValidatorIntf Methods">
    @Override
    public boolean validateMove(Point currentSystemCoord, Point proposedSystemCoord) {
        if (currentMap != null) {
            Point proposedCellCoord = currentMap.getCellLocation(proposedSystemCoord);
            return currentMap.validateLocation(proposedCellCoord);
        }
        return true;
    }
//</editor-fold>

}
