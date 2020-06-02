package ru.job4j.tracker;

public class TrackerFour {
        private TrackerFour() {
        }

        public static TrackerFour getInstance() {
            return Holder.INSTANCE;
        }

        public Item add(Item model) {
            return model;
        }

        private static final class Holder {
            private static final TrackerFour INSTANCE = new TrackerFour();
        }

        public static void main(String[] args) {
            TrackerSingle tracker = TrackerSingle.getInstance();
        }
    }
