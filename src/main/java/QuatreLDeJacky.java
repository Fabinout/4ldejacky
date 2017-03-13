public class QuatreLDeJacky {


    public boolean nombreEstInteressant(int kilometrage) {
        return suite_de_chiffres(kilometrage) ||
                is_james_bond_number(kilometrage) ||
                que_le_meme_chiffre(kilometrage);

    }

    private boolean suite_de_chiffres(int kilometrage) {
        String km = String.valueOf(kilometrage);

        for (int i = 1; i < km.length(); i++) {
            if (km.charAt(i) != km.charAt(i - 1) + 1) return false;
        }

        return  true;
    }


    private boolean que_le_meme_chiffre(int kilometrage) {
        String km = String.valueOf(kilometrage);

        for (int i = 0; i < km.length(); i++) {
            if (km.charAt(i) != km.charAt(0)) return false;

        }
        return true;
    }


    private boolean is_james_bond_number(int kilometrage) {
        return ((kilometrage - 7) % 1000 == 0);
    }
}
