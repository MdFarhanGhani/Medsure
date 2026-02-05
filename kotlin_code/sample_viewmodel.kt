class MedicineViewModel {

    private val medicineList = mutableListOf<Medicine>()

    fun addMedicine(medicine: Medicine) {
        medicineList.add(medicine)
    }

    fun getMedicines(): List<Medicine> {
        return medicineList
    }
}
