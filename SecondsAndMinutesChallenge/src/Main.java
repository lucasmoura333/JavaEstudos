public class Main {
    public static void main(String[] args) {
            System.out.println(getDurationString(3945)); //Primeiro caso com um parametro
            System.out.println(getDurationString(65,45)); //Segundo caso com dois parametros.
    }
    public static String getDurationString(int seconds){


        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds
                    +"), must be a positive integer value";
        }
        int minutes = seconds /60;
        return getDurationString(seconds / 60,minutes % 60);

    }

    public static String getDurationString(int minutes, int seconds){

        if (minutes < 0) {
            return "Invalid data for seconds(" + minutes
                    +"), must be a positive integer value";
        }

        if (seconds <= 0 || seconds >= 59){
              return "Invalid data for seconds(" +seconds
                    +"), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int restoMinutos = minutes % 60;
        int restoSeconds = seconds % 60;

        return hours + "h "+ restoMinutos + "m " + restoSeconds + "s.";
    }
}