package solveme

object Calculator {
    var nowValue: Double? = null


    //////////////////////////////// set
    fun set(): Calculator {
        nowValue = 0.0
        return this
    }
    fun set(value: Int): Calculator {
        nowValue = value.toDouble()
        return this
    }
    fun set(value: Double): Calculator {
        nowValue = value
        return this
    }

    //////////////////////////////// add
    fun add(value: Int): Calculator {
        if (nowValue != null)
            nowValue = nowValue!! + value.toDouble()
        return this
    }
    fun add(value: Double): Calculator {
        if (nowValue != null)
            nowValue = nowValue!! + value
        return this
    }

    //////////////////////////////// sub
    fun sub(value: Int): Calculator {
        if (nowValue != null)
            nowValue = nowValue!! - value.toDouble()
        return this
    }
    fun sub(value: Double): Calculator {
        if (nowValue != null)
            nowValue = nowValue!! - value
        return this
    }

    //////////////////////////////// mul
    fun mul(value: Int): Calculator {
        if (nowValue != null)
            nowValue = nowValue!! * value
        return this
    }
    fun mul(value: Double): Calculator {
        if (nowValue != null)
            nowValue = nowValue!! * value
        return this
    }

    //////////////////////////////// div
    fun div(value: Int): Calculator {
        if (value == 0)
            nowValue = null
        else if (nowValue != null)
            nowValue = nowValue!! / value
        return this
    }
    fun div(value: Double): Calculator {
        if (value == 0.0)
            nowValue = null
        else if (nowValue != null)
            nowValue = nowValue!! / value
        return this
    }
}
