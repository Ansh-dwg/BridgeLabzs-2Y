public class SmartHomeLighting {
    
    interface LightBehavior {
        void activate();
    }
    
    public static void main(String[] args) {
        LightBehavior motion = () -> System.out.println("Motion detected: Lights turned ON at 100% brightness");
        
        LightBehavior morning = () -> System.out.println("Morning time: Lights set to 50% warm white");
        
        LightBehavior evening = () -> System.out.println("Evening time: Lights set to 80% cool white");
        
        LightBehavior night = () -> System.out.println("Night time: Lights dimmed to 20%");
        
        LightBehavior voice = () -> System.out.println("Voice command: Lights toggled");
        
        LightBehavior away = () -> System.out.println("Away mode: All lights turned OFF");
        
        System.out.println("Smart Home Lighting System\n");
        
        motion.activate();
        morning.activate();
        evening.activate();
        night.activate();
        voice.activate();
        away.activate();
    }
}