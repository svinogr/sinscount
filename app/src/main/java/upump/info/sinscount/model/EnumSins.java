package upump.info.sinscount.model;

public enum EnumSins {
    LUST() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Похоть");
            sin.setDescription("Описание греха");
            sin.setImg("lust");
            return sin;
        }
    }, GLUTTONY() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Обжорство");
            sin.setDescription("Описание греха");
            sin.setImg("glut");
            return sin;
        }
    }, GREED() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Жадность");
            sin.setDescription("Описание греха");
            sin.setImg("greed");
            return sin;
        }
    }, SLOTH() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Лень");
            sin.setDescription("Описание греха");
            sin.setImg("sloth");
            return sin;
        }
    }, WRATH() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Гнев");
            sin.setDescription("Описание греха");
            sin.setImg("wrath");
            return sin;
        }
    }, ENVY() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Зависть");
            sin.setDescription("Описание греха");
            sin.setImg("envy");
            return sin;
        }
    }, PRIDE() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Гордыня");
            sin.setDescription("Описание греха");
            sin.setImg("pride");
            return sin;
        }
    };

    public abstract Sin getSin();
}
