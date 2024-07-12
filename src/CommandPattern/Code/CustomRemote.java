package CommandPattern.Code;

public class CustomRemote {
    RemoteControl remoteControl;

    public CustomRemote() {
        Init();
    }

    private void Init() {
        remoteControl = new RemoteControl();
        AddLightCommand();
        AddAirconditionCommand();
        AddStereoCommand();
    }

    private void AddLightCommand() {
        var light = new Light();
        var lightOnCommand = new LightOnCommand(light);
        var lightOffCommand = new LightOffCommand(light);
        remoteControl.SetCommand(1, lightOnCommand, lightOffCommand);
    }

    private void AddAirconditionCommand() {
        var aircondition = new Aircondition();
        var airconditionOnCommand = new AirconditionOnCommand(aircondition);
        var airconditionOffCommand = new AirconditionOffCommand(aircondition);
        ;
        remoteControl.SetCommand(2, airconditionOnCommand, airconditionOffCommand);
    }

    private void AddStereoCommand() {
        var stereo = new Stereo();
        var stereoOnCommand = new StereoOnCommand(stereo);
        var stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.SetCommand(3, stereoOnCommand, stereoOffCommand);
    }

    public void PressButton(int id) {
        remoteControl.PressButton(id);
    }
}