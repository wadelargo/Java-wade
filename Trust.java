
public class Trust {
    private String trustBrand;
    private String trustFlavour;
    private String trustRounds;

        public Trust(String trustBrand, String trustFlavour, String trustRounds) {
        this.trustBrand = trustBrand;
        this.trustFlavour = trustFlavour;
        this.trustRounds = trustRounds;
    }

        public String getTrustBrand() {
            return trustBrand;
        }

        public void setTrustBrand(String trustBrand) {
            this.trustBrand = trustBrand;
        }

        public String getTrustFlavour() {
            return trustFlavour;
        }

        public void setTrustFlavour(String trustFlavour) {
            this.trustFlavour = trustFlavour;
        }

        public String getTrusRounds() {
             return trustRounds;
        }

        public void setTrustRounds(String trustRounds) {
            this.trustRounds = trustRounds;
        }
        

        @Override
    public String toString() {
        return trustBrand + "Brand, " + trustFlavour + "Flavour, " + trustRounds + "Rounds,";
    }

}
