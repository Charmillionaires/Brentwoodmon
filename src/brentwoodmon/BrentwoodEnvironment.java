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
import javax.swing.JFrame;
import map.Item;
import map.ItemEventHandlerIntf;
import map.Map;
import map.MapVisualizerDefault;
import map.Obstacle;
import map.ObstacleEventHandlerIntf;
import map.Portal;
import map.PortalEventHandlerIntf;

/**
 *
 * @author kimberlygilson
 */
public class BrentwoodEnvironment extends Environment implements PortalEventHandlerIntf, ObstacleEventHandlerIntf, ItemEventHandlerIntf, ItemManagerResponseIntf {

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

    /**
     * @param map the Map to set
     */
    public void setCurrentMap(Map map) {
        currentMap = map;
    }

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



        //alex
        Map.addPortal(bcampus, new Point(42, 12), adent, new Point(7, 21));
        Map.addPortal(bcampus, new Point(43, 12), adent, new Point(7, 21));
        Map.addPortal(adent, new Point(7, 21), bcampus, new Point(42, 12));
        Map.addPortal(adent, new Point(7, 22), bcampus, new Point(42, 12));
        Map.addPortal(adent, new Point(14, 5), ahent, new Point(2, 4));
        Map.addPortal(ahent, new Point(2, 4), adent, new Point(14, 5));


        //mack
        Map.addPortal(bcampus, new Point(34, 6), mdent, new Point(7, 21));
        Map.addPortal(mdent, new Point(7, 21), bcampus, new Point(34, 6));
        Map.addPortal(mdent, new Point(7, 22), bcampus, new Point(34, 6));
        Map.addPortal(mdent, new Point(14, 5), mhent, new Point(2, 4));
        Map.addPortal(mhent, new Point(2, 4), mdent, new Point(14, 5));



        //hope
        Map.addPortal(ucampus, new Point(45, 33), hdent, new Point(7, 21));
        Map.addPortal(hdent, new Point(7, 21), ucampus, new Point(45, 33));
        Map.addPortal(hdent, new Point(7, 22), ucampus, new Point(45, 33));
        Map.addPortal(hdent, new Point(14, 5), hhent, new Point(2, 4));
        Map.addPortal(hhent, new Point(2, 4), hdent, new Point(14, 5));


        //rogers
        Map.addPortal(ucampus, new Point(38, 33), rdent, new Point(7, 21));
        Map.addPortal(rdent, new Point(7, 21), ucampus, new Point(38, 33));
        Map.addPortal(rdent, new Point(7, 22), ucampus, new Point(38, 33));
        Map.addPortal(rdent, new Point(14, 5), rhent, new Point(2, 4));
        Map.addPortal(rhent, new Point(2, 4), rdent, new Point(14, 5));



        //ellis
        Map.addPortal(ucampus, new Point(59, 33), edent, new Point(7, 21));
        Map.addPortal(ucampus, new Point(58, 33), edent, new Point(7, 21));
        Map.addPortal(edent, new Point(7, 21), ucampus, new Point(59, 33));
        Map.addPortal(edent, new Point(7, 22), ucampus, new Point(58, 33));
        Map.addPortal(edent, new Point(14, 5), ehent, new Point(2, 4));
        Map.addPortal(ehent, new Point(2, 4), edent, new Point(14, 5));


        //whittal
        Map.addPortal(bcampus, new Point(49, 9), wdent, new Point(7, 21));
        Map.addPortal(wdent, new Point(14, 9), bcampus, new Point(49, 9));
        Map.addPortal(edent, new Point(7, 22), bcampus, new Point(49, 9));
        Map.addPortal(wdent, new Point(14, 5), whent, new Point(2, 4));
        Map.addPortal(whent, new Point(2, 4), wdent, new Point(14, 5));


        //privett
        Map.addPortal(bcampus, new Point(61, 5), pdent, new Point(7, 21));
        Map.addPortal(pdent, new Point(7, 21), bcampus, new Point(61, 5));
        Map.addPortal(edent, new Point(7, 22), bcampus, new Point(61, 5));
        Map.addPortal(pdent, new Point(14, 5), phent, new Point(2, 4));
        Map.addPortal(phent, new Point(2, 4), pdent, new Point(14, 5));

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

        //hidden
        Map.addPortal(bcampus, new Point(2, 1), hid, new Point(11, 19));
        Map.addPortal(hid, new Point(11, 19), bcampus, new Point(2, 1));
        Map.addPortal(hid, new Point(10, 19), bcampus, new Point(2, 1));
        Map.addPortal(hid, new Point(13, 19), bcampus, new Point(2, 1));




//        Map.addPortal(getBcampus(), new Point(30, 19), getDross(), new Point(9, 9));
//        
//        Map.addPortal(getDross(), new Point(9, 9), getBcampus(), new Point(30, 19));
//        Map.addPortal(getDross(), new Point(5, 9), getBcampus(), new Point(30, 19));
//        
//        Map.addPortal(getBcampus(), new Point(37, 0), getUcampus(), new Point(25, 34));
//        Map.addPortal(getBcampus(), new Point(36, 0), getUcampus(), new Point(24, 34));
//        Map.addPortal(getUcampus(), new Point(24, 34), getBcampus(), new Point(36, 0));
//        Map.addPortal(getUcampus(), new Point(25, 34), getBcampus(), new Point(37, 0));

        setCurrentMap(getBcampus());
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
        hero = new Hero(new Point(700, 50), new Velocity(0, 0));
        getActors().add(hero);

        shaq = new Shaq(new Point(700, 100), new Velocity(0, 0));
        getActors().add(shaq);

        snorlax = new Snorlax(new Point(700, 150), new Velocity(0, 0));
        getActors().add(snorlax);
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
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.setState(State.FRONT_WALK);
            snorlax.setState(State.FRONT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.setState(State.BACK_WALK);
            snorlax.setState(State.BACK_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.setState(State.RIGHT_WALK);
            snorlax.setState(State.RIGHT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.setState(State.LEFT_WALK);
            snorlax.setState(State.LEFT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            hero.setState(State.STAND);
            snorlax.setState(State.STAND);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            shaq.setState(State.FRONT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            shaq.setState(State.BACK_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            shaq.setState(State.RIGHT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            shaq.setState(State.LEFT_WALK);
        } else if (e.getKeyCode() == KeyEvent.VK_1) {
            showCombat();
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
    }

//<editor-fold defaultstate="collapsed" desc="Dialogs">
    private void showCombat() {
        JFrame frmCombat = new JFrame("Combat");
        Combat myCombat = new Combat();

        frmCombat.add(myCombat);
        frmCombat.setAlwaysOnTop(true);
        frmCombat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCombat.setSize(new Dimension(600, 400));

        frmCombat.setVisible(true);
    }

    private void showDialog() {
        JFrame frmDialog = new JFrame("Dialog");
        Dialog myDialog = new Dialog("yes", "yes");

        frmDialog.add(myDialog);
        frmDialog.setAlwaysOnTop(true);
        frmDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmDialog.setSize(new Dimension(600, 400));

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
        AudioPlayer.play("/resources/water.wav");
        return false;
    }
//</editor-fold>
}
