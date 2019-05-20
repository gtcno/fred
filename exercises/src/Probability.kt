package src


data class Probability(private val value: Double) {
    fun inverse() = Probability(1.0 - this.value)

    init {
        require(value in 0.0..1.0)
    }

    overr
}