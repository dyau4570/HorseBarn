package DarrenYau;

public class HorseBarn {
    private Horses[] spaces;
    public HorseBarn (Horses[] spaces) {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void consolidate() {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i].equals(null)) {
                for (int j = 0; i < spaces.length; j++) {
                    if (!spaces[j].equals(null)) {
                        spaces[i] = spaces[j];
                    }
                }
            }
        }
    }
}