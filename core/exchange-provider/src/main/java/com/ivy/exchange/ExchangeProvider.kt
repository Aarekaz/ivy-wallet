package com.ivy.exchange

import com.ivy.data.CurrencyCode

interface ExchangeProvider {
    suspend fun fetchExchangeRates(baseCurrency: CurrencyCode): Map<CurrencyCode, Double>
}