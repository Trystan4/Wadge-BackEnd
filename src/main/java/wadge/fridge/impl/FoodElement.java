package wadge.fridge.impl;

public class FoodElement {
        private String insertionDate;
        private String peremptionDate;
        private int quantity;

        public FoodElement() {}
        
        public FoodElement(String insertionDate, String peremptionDate, int quantity) {
            this.insertionDate = insertionDate;
            this.peremptionDate = peremptionDate;
            this.quantity = quantity;
        }

        public String getInsertionDate() { return this.insertionDate; }
        public String getPeremptionDate() { return this.peremptionDate; }
        public int getQuantity() { return quantity; }

        @Override
        public String toString() {
            return "FoodElement [insertionDate=" + insertionDate + ", peremptionDate=" + peremptionDate + ", quantity="
                    + quantity + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((insertionDate == null) ? 0 : insertionDate.hashCode());
            result = prime * result + ((peremptionDate == null) ? 0 : peremptionDate.hashCode());
            result = prime * result + quantity;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            FoodElement other = (FoodElement) obj;
            if (insertionDate == null) {
                if (other.insertionDate != null)
                    return false;
            } else if (!insertionDate.equals(other.insertionDate))
                return false;
            if (peremptionDate == null) {
                if (other.peremptionDate != null)
                    return false;
            } else if (!peremptionDate.equals(other.peremptionDate))
                return false;
            if (quantity != other.quantity)
                return false;
            return true;
        }
}
