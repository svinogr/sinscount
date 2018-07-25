package upump.info.sinscount.model;

public enum EnumSins {
    LUST() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Название греха");
            sin.setDescription("Описание греха");
            sin.setImg("test");
            return sin;
        }
    }, GLUTTONY() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Название греха");
            sin.setDescription("Описание греха");
            sin.setImg("test");
            return sin;
        }
    }, GREED() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Название греха");
            sin.setDescription("Описание греха");
            sin.setImg("test");
            return sin;
        }
    }, SLOTH() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Название греха");
            sin.setDescription("Описание греха");
            sin.setImg("test");
            return sin;
        }
    }, WRATH() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Название греха");
            sin.setDescription("Описание греха");
            sin.setImg("test");
            return sin;
        }
    }, ENVY() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Название греха");
            sin.setDescription("Описание греха");
            sin.setImg("test");
            return sin;
        }
    }, PRIDE() {
        @Override
        public Sin getSin() {
            Sin sin = new Sin();
            sin.setName("Название греха");
            sin.setDescription("Описание греха");
            sin.setImg("test");
            return sin;
        }
    };

    public abstract Sin getSin();
}
