Forex Endpoints
=====================

     
Forex Exchanges
----------------
tags:forex,forex_exchanges
*GET the endpoint:"/forex/exchange" check if status code is "200" and the json scheme matches with the file "jsonSchema/forexExchanges.json"

Forex Symbols
----------------
tags:forex,forex_symbols
* GET the endpoint:"/forex/symbol" with query parameters: "exchange","","","" and values: "oanda","","",""  check if status code is "200" and the json scheme matches with the file "jsonSchema/forexSymbols.json"

Forex Candles
----------------
tags:forex,forex_candles
*GET the endpoint:"/forex/candle" with query parameters: "symbol","resolution","from","to" and values: "OANDA:EUR_USD","D","1572651390","1575243390"  check if status code is "200" and the json scheme matches with the file "jsonSchema/forexCandles.json"

Forex Rates
-------------
tags:forex,forex_rates
*GET the endpoint:"/forex/rates" with query parameters: "base","","","" and values: "USD","","",""  check if status code is "200" and the json scheme matches with the file "jsonSchema/forexRates.json"