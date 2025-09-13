package practice.practice2.task11;

public class DoorFacade {
    private DoorOpener doorOpener;
    private DoorCloser doorCloser;
    private DoorBlocker doorBlocker;

    public DoorFacade(DoorOpener doorOpener, DoorCloser doorCloser, DoorBlocker doorBlocker) {
        this.doorOpener = doorOpener;
        this.doorCloser = doorCloser;
        this.doorBlocker = doorBlocker;
    }

    public void interactDoor() {
        doorOpener.openDoor();
        doorCloser.doorClose();
        doorBlocker.blockDoor();
    }
}
