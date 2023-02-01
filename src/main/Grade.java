package main;

public enum Grade {
    A {
        @Override
        public Grade upgrade() {
            return Grade.A;
        }
    },
    B,
    C,
    D,
    E,
    F {
        @Override
        public Grade downgrade() {
            return Grade.F;
        }
    };

    public Grade upgrade() {
        return values()[ordinal() - 1];
    }

    public Grade downgrade() {
        return values()[ordinal() + 1];
    }
}
