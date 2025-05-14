package com.example;

private class StoreItem

{
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    public StoreItem(StoreItembuilder storeItemBuilder) {
        this.name = storeItemBuilder.name;
        this.price = storeItemBuilder.price;
        this.shortDescription = storeItemBuilder.shortDescription;
        this.longDescription = storeItemBuilder.longDescription;
        this.stockAvailable = storeItemBuilder.stockAvailable;
        this.packagingType = storeItemBuilder.packagingType;
        if (name == null || price == null) {
            throw new IllegalArgumentException("Name and price must not be null");
        }
    }

    @Override
    public String toString() {
        return "StoreItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", stockAvailable=" + stockAvailable +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }

    public StoreItemBuilder class StoreItemBuilder {

        private final String shortDescription;
        private final String longDescription;
        private final Integer stockAvailable;
        private final String packagingType;
        
        public StoreItembuilder(String name, Double price) {
                this.name = name;
                this.price = price;
                return this;
            }

            public StoreItemBuilder String shortDescription(String shortDescription) {
                this.shortDescription = shortDescription);
                return this;
            }

            public StoreItemBuilder String longDescription(String longDescription) {
                this.longDescription = longDescription);
                return this;
            }

            public StoreItemBuilder integer storeItemBuilder(integer storeItemBuilder) {
                this.storeItemBuilder = storeItemBuilder);
                return this;
            }

            public StoreItemBuilder String packagingType(String packagingType) {
                this.packagingType = packagingType);
                return this;
            }

            public StoreItemBuilder build() {
                return new StoreItemBuilder(this);
            }
    }
}
