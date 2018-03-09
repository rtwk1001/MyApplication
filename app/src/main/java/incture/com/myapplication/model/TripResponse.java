package incture.com.myapplication.model;

import java.util.List;

/**
 * Created by Ritwik.Jain on 3/9/2018.
 */

public class TripResponse {

    /**
     * code : 200
     * status : true
     * data : {"tripId":"TRIP00000002","status":"ENROUTE","updateAt":1519634810655,"createdAt":1519634810655,"createdBy":"createdBy4","updatedBy":"updatedBy4","startTime":1519634810655,"endTime":1519634810655,"deliveryHeader":[{"deliveryNoteId":1010101,"createdDate":1519634810655,"salesGroup":"salesGroup4","purchaseOrder":"purchaseOrder4","refNo":10105,"storageLocation":"storageLocation4","city":"city4","areaCode":"areaCode1","telephone":"telephone4","soldToAddress":"soldToAddress4","shipToAddress":"Institute of Statistics, RT.1/RW.4, Kampung Melayu, East Jakarta City, Jakarta, Indonesia","longitude":106.8665815,"latitude":-6.2315055,"shippingType":"shippingType4","instructionForDelivery":"instructionForDelivery4","status":"ENROUTE","expDeliveryDate":null,"actDeliveryDate":null,"deliveryItems":[{"deliveryItemId":101101,"serialNum":"serialNum4","material":"material4","description":"description4","batch":"batch4","quantity":"quantity4","volume":"volume4","scanItems":[]}],"deliveryOrder":null,"tripped":false},{"deliveryNoteId":1010121,"createdDate":1519634810655,"salesGroup":"salesGroup4","purchaseOrder":"purchaseOrder4","refNo":10105,"storageLocation":"storageLocation4","city":"city4","areaCode":"areaCode1","telephone":"telephone4","soldToAddress":"soldToAddress4","shipToAddress":"Bank BCA KCP Kramat Jati, RT.1/RW.1, Kramat Jati, East Jakarta City, Jakarta, Indonesia","longitude":106.8665815,"latitude":-6.2315055,"shippingType":"shippingType4","instructionForDelivery":"instructionForDelivery4","status":"ENROUTE","expDeliveryDate":null,"actDeliveryDate":null,"deliveryItems":[{"deliveryItemId":10121,"serialNum":"serialNum4","material":"material4","description":"description4","batch":"batch4","quantity":"quantity4","volume":"volume4","scanItems":[]}],"deliveryOrder":null,"tripped":false}],"user":null}
     * message : SUCCESS
     */

    private int code;
    private boolean status;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * tripId : TRIP00000002
         * status : ENROUTE
         * updateAt : 1519634810655
         * createdAt : 1519634810655
         * createdBy : createdBy4
         * updatedBy : updatedBy4
         * startTime : 1519634810655
         * endTime : 1519634810655
         * deliveryHeader : [{"deliveryNoteId":1010101,"createdDate":1519634810655,"salesGroup":"salesGroup4","purchaseOrder":"purchaseOrder4","refNo":10105,"storageLocation":"storageLocation4","city":"city4","areaCode":"areaCode1","telephone":"telephone4","soldToAddress":"soldToAddress4","shipToAddress":"Institute of Statistics, RT.1/RW.4, Kampung Melayu, East Jakarta City, Jakarta, Indonesia","longitude":106.8665815,"latitude":-6.2315055,"shippingType":"shippingType4","instructionForDelivery":"instructionForDelivery4","status":"ENROUTE","expDeliveryDate":null,"actDeliveryDate":null,"deliveryItems":[{"deliveryItemId":101101,"serialNum":"serialNum4","material":"material4","description":"description4","batch":"batch4","quantity":"quantity4","volume":"volume4","scanItems":[]}],"deliveryOrder":null,"tripped":false},{"deliveryNoteId":1010121,"createdDate":1519634810655,"salesGroup":"salesGroup4","purchaseOrder":"purchaseOrder4","refNo":10105,"storageLocation":"storageLocation4","city":"city4","areaCode":"areaCode1","telephone":"telephone4","soldToAddress":"soldToAddress4","shipToAddress":"Bank BCA KCP Kramat Jati, RT.1/RW.1, Kramat Jati, East Jakarta City, Jakarta, Indonesia","longitude":106.8665815,"latitude":-6.2315055,"shippingType":"shippingType4","instructionForDelivery":"instructionForDelivery4","status":"ENROUTE","expDeliveryDate":null,"actDeliveryDate":null,"deliveryItems":[{"deliveryItemId":10121,"serialNum":"serialNum4","material":"material4","description":"description4","batch":"batch4","quantity":"quantity4","volume":"volume4","scanItems":[]}],"deliveryOrder":null,"tripped":false}]
         * user : null
         */

        private String tripId;
        private String status;
        private long updateAt;
        private long createdAt;
        private String createdBy;
        private String updatedBy;
        private long startTime;
        private long endTime;
        private Object user;
        private List<DeliveryHeaderBean> deliveryHeader;

        public String getTripId() {
            return tripId;
        }

        public void setTripId(String tripId) {
            this.tripId = tripId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public long getUpdateAt() {
            return updateAt;
        }

        public void setUpdateAt(long updateAt) {
            this.updateAt = updateAt;
        }

        public long getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(long createdAt) {
            this.createdAt = createdAt;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public String getUpdatedBy() {
            return updatedBy;
        }

        public void setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
        }

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public Object getUser() {
            return user;
        }

        public void setUser(Object user) {
            this.user = user;
        }

        public List<DeliveryHeaderBean> getDeliveryHeader() {
            return deliveryHeader;
        }

        public void setDeliveryHeader(List<DeliveryHeaderBean> deliveryHeader) {
            this.deliveryHeader = deliveryHeader;
        }

        public static class DeliveryHeaderBean {
            /**
             * deliveryNoteId : 1010101
             * createdDate : 1519634810655
             * salesGroup : salesGroup4
             * purchaseOrder : purchaseOrder4
             * refNo : 10105
             * storageLocation : storageLocation4
             * city : city4
             * areaCode : areaCode1
             * telephone : telephone4
             * soldToAddress : soldToAddress4
             * shipToAddress : Institute of Statistics, RT.1/RW.4, Kampung Melayu, East Jakarta City, Jakarta, Indonesia
             * longitude : 106.8665815
             * latitude : -6.2315055
             * shippingType : shippingType4
             * instructionForDelivery : instructionForDelivery4
             * status : ENROUTE
             * expDeliveryDate : null
             * actDeliveryDate : null
             * deliveryItems : [{"deliveryItemId":101101,"serialNum":"serialNum4","material":"material4","description":"description4","batch":"batch4","quantity":"quantity4","volume":"volume4","scanItems":[]}]
             * deliveryOrder : null
             * tripped : false
             */

            private int deliveryNoteId;
            private long createdDate;
            private String salesGroup;
            private String purchaseOrder;
            private int refNo;
            private String storageLocation;
            private String city;
            private String areaCode;
            private String telephone;
            private String soldToAddress;
            private String shipToAddress;
            private double longitude;
            private double latitude;
            private String shippingType;
            private String instructionForDelivery;
            private String status;
            private Object expDeliveryDate;
            private Object actDeliveryDate;
            private Object deliveryOrder;
            private boolean tripped;
            private List<DeliveryItemsBean> deliveryItems;

            public int getDeliveryNoteId() {
                return deliveryNoteId;
            }

            public void setDeliveryNoteId(int deliveryNoteId) {
                this.deliveryNoteId = deliveryNoteId;
            }

            public long getCreatedDate() {
                return createdDate;
            }

            public void setCreatedDate(long createdDate) {
                this.createdDate = createdDate;
            }

            public String getSalesGroup() {
                return salesGroup;
            }

            public void setSalesGroup(String salesGroup) {
                this.salesGroup = salesGroup;
            }

            public String getPurchaseOrder() {
                if(purchaseOrder == null){
                    return "";
                }
                return purchaseOrder;
            }

            public void setPurchaseOrder(String purchaseOrder) {
                this.purchaseOrder = purchaseOrder;
            }

            public int getRefNo() {
                return refNo;
            }

            public void setRefNo(int refNo) {
                this.refNo = refNo;
            }

            public String getStorageLocation() {
                return storageLocation;
            }

            public void setStorageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getAreaCode() {
                return areaCode;
            }

            public void setAreaCode(String areaCode) {
                this.areaCode = areaCode;
            }

            public String getTelephone() {
                return telephone;
            }

            public void setTelephone(String telephone) {
                this.telephone = telephone;
            }

            public String getSoldToAddress() {
                if(soldToAddress == null){
                    return "";
                }
                return soldToAddress;
            }

            public void setSoldToAddress(String soldToAddress) {
                this.soldToAddress = soldToAddress;
            }

            public String getShipToAddress() {
                return shipToAddress;
            }

            public void setShipToAddress(String shipToAddress) {
                this.shipToAddress = shipToAddress;
            }

            public double getLongitude() {
                return longitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }

            public double getLatitude() {
                return latitude;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public String getShippingType() {
                return shippingType;
            }

            public void setShippingType(String shippingType) {
                this.shippingType = shippingType;
            }

            public String getInstructionForDelivery() {
                return instructionForDelivery;
            }

            public void setInstructionForDelivery(String instructionForDelivery) {
                this.instructionForDelivery = instructionForDelivery;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public Object getExpDeliveryDate() {
                return expDeliveryDate;
            }

            public void setExpDeliveryDate(Object expDeliveryDate) {
                this.expDeliveryDate = expDeliveryDate;
            }

            public Object getActDeliveryDate() {
                return actDeliveryDate;
            }

            public void setActDeliveryDate(Object actDeliveryDate) {
                this.actDeliveryDate = actDeliveryDate;
            }

            public Object getDeliveryOrder() {
                return deliveryOrder;
            }

            public void setDeliveryOrder(Object deliveryOrder) {
                this.deliveryOrder = deliveryOrder;
            }

            public boolean isTripped() {
                return tripped;
            }

            public void setTripped(boolean tripped) {
                this.tripped = tripped;
            }

            public List<DeliveryItemsBean> getDeliveryItems() {
                return deliveryItems;
            }

            public void setDeliveryItems(List<DeliveryItemsBean> deliveryItems) {
                this.deliveryItems = deliveryItems;
            }

            public static class DeliveryItemsBean {
                /**
                 * deliveryItemId : 101101
                 * serialNum : serialNum4
                 * material : material4
                 * description : description4
                 * batch : batch4
                 * quantity : quantity4
                 * volume : volume4
                 * scanItems : []
                 */

                private int deliveryItemId;
                private String serialNum;
                private String material;
                private String description;
                private String batch;
                private String quantity;
                private String volume;
                private List<?> scanItems;

                public int getDeliveryItemId() {
                    return deliveryItemId;
                }

                public void setDeliveryItemId(int deliveryItemId) {
                    this.deliveryItemId = deliveryItemId;
                }

                public String getSerialNum() {
                    return serialNum;
                }

                public void setSerialNum(String serialNum) {
                    this.serialNum = serialNum;
                }

                public String getMaterial() {
                    return material;
                }

                public void setMaterial(String material) {
                    this.material = material;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getBatch() {
                    return batch;
                }

                public void setBatch(String batch) {
                    this.batch = batch;
                }

                public String getQuantity() {
                    return quantity;
                }

                public void setQuantity(String quantity) {
                    this.quantity = quantity;
                }

                public String getVolume() {
                    return volume;
                }

                public void setVolume(String volume) {
                    this.volume = volume;
                }

                public List<?> getScanItems() {
                    return scanItems;
                }

                public void setScanItems(List<?> scanItems) {
                    this.scanItems = scanItems;
                }
            }
        }
    }
}
