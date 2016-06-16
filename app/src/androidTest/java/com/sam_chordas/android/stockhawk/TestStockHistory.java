package com.sam_chordas.android.stockhawk;

import android.test.AndroidTestCase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sam_chordas.android.stockhawk.stock_history.HistoryData;
import com.sam_chordas.android.stockhawk.stock_history.Quote;
import com.sam_chordas.android.stockhawk.stock_history.StockHistoryHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnztx on 16/6/16.
 */
public class TestStockHistory extends AndroidTestCase{
	private String rawJsonData = "{\"query\":{\"count\":189,\"created\":\"2016-06-16T06:08:30Z\",\"lang\":\"en-US\",\"diagnostics\":{\"url\":[{\"execution-start-time\":\"0\",\"execution-stop-time\":\"2\",\"execution-time\":\"2\",\"content\":\"http://www.datatables.org/yahoo/finance/yahoo.finance.historicaldata.xml\"},{\"execution-start-time\":\"7\",\"execution-stop-time\":\"179\",\"execution-time\":\"172\",\"content\":\"http://ichart.finance.yahoo.com/table.csv?a=8&b=11&e=10&g=d&c=2015&d=5&f=2016&s=YHOO\"},{\"execution-start-time\":\"183\",\"execution-stop-time\":\"184\",\"execution-time\":\"1\",\"content\":\"http://ichart.finance.yahoo.com/table.csv?a=8&b=11&e=10&g=d&c=2015&d=5&f=2016&s=YHOO\"}],\"publiclyCallable\":\"true\",\"cache\":[{\"execution-start-time\":\"5\",\"execution-stop-time\":\"6\",\"execution-time\":\"1\",\"method\":\"GET\",\"type\":\"MEMCACHED\",\"content\":\"9bc19dd7a9ae902a42cf44b11f34c9ff\"},{\"execution-start-time\":\"181\",\"execution-stop-time\":\"182\",\"execution-time\":\"1\",\"method\":\"GET\",\"type\":\"MEMCACHED\",\"content\":\"d431e0d6cc058eec6364c99c398f41e5\"}],\"query\":[{\"execution-start-time\":\"6\",\"execution-stop-time\":\"181\",\"execution-time\":\"175\",\"params\":\"{url=[http://ichart.finance.yahoo.com/table.csv?a=8&b=11&e=10&g=d&c=2015&d=5&f=2016&s=YHOO]}\",\"content\":\"select * from csv(0,1) where url=@url\"},{\"execution-start-time\":\"182\",\"execution-stop-time\":\"186\",\"execution-time\":\"4\",\"params\":\"{columnsNames=[Date,Open,High,Low,Close,Volume,Adj_Close], url=[http://ichart.finance.yahoo.com/table.csv?a=8&b=11&e=10&g=d&c=2015&d=5&f=2016&s=YHOO]}\",\"content\":\"select * from csv(2,0) where url=@url and columns=@columnsNames\"}],\"javascript\":{\"execution-start-time\":\"3\",\"execution-stop-time\":\"1018\",\"execution-time\":\"1014\",\"instructions-used\":\"13686052\",\"table-name\":\"yahoo.finance.historicaldata\"},\"user-time\":\"1022\",\"service-time\":\"177\",\"build-version\":\"0.2.8\"},\"results\":{\"quote\":[{\"Symbol\":\"YHOO\",\"Date\":\"2016-06-10\",\"Open\":\"36.970001\",\"High\":\"37.139999\",\"Low\":\"36.59\",\"Close\":\"36.830002\",\"Volume\":\"11176600\",\"Adj_Close\":\"36.830002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-06-09\",\"Open\":\"36.82\",\"High\":\"37.73\",\"Low\":\"36.709999\",\"Close\":\"37.349998\",\"Volume\":\"14731200\",\"Adj_Close\":\"37.349998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-06-08\",\"Open\":\"36.84\",\"High\":\"37.299999\",\"Low\":\"36.84\",\"Close\":\"36.970001\",\"Volume\":\"9179200\",\"Adj_Close\":\"36.970001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-06-07\",\"Open\":\"36.900002\",\"High\":\"36.990002\",\"Low\":\"36.630001\",\"Close\":\"36.73\",\"Volume\":\"14745100\",\"Adj_Close\":\"36.73\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-06-06\",\"Open\":\"36.669998\",\"High\":\"37.200001\",\"Low\":\"36.52\",\"Close\":\"37.07\",\"Volume\":\"8423500\",\"Adj_Close\":\"37.07\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-06-03\",\"Open\":\"37.110001\",\"High\":\"37.110001\",\"Low\":\"36.50\",\"Close\":\"36.599998\",\"Volume\":\"12048300\",\"Adj_Close\":\"36.599998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-06-02\",\"Open\":\"36.66\",\"High\":\"37.220001\",\"Low\":\"36.580002\",\"Close\":\"37.150002\",\"Volume\":\"12155200\",\"Adj_Close\":\"37.150002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-06-01\",\"Open\":\"37.25\",\"High\":\"37.740002\",\"Low\":\"36.560001\",\"Close\":\"36.650002\",\"Volume\":\"22138100\",\"Adj_Close\":\"36.650002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-31\",\"Open\":\"37.73\",\"High\":\"38.080002\",\"Low\":\"37.50\",\"Close\":\"37.939999\",\"Volume\":\"12807000\",\"Adj_Close\":\"37.939999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-27\",\"Open\":\"36.880001\",\"High\":\"37.880001\",\"Low\":\"36.84\",\"Close\":\"37.82\",\"Volume\":\"14642500\",\"Adj_Close\":\"37.82\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-26\",\"Open\":\"36.130001\",\"High\":\"36.849998\",\"Low\":\"36.07\",\"Close\":\"36.759998\",\"Volume\":\"16277900\",\"Adj_Close\":\"36.759998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-25\",\"Open\":\"36.630001\",\"High\":\"36.959999\",\"Low\":\"35.470001\",\"Close\":\"35.59\",\"Volume\":\"33984900\",\"Adj_Close\":\"35.59\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-24\",\"Open\":\"36.849998\",\"High\":\"37.630001\",\"Low\":\"36.77\",\"Close\":\"37.529999\",\"Volume\":\"10601300\",\"Adj_Close\":\"37.529999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-23\",\"Open\":\"36.459999\",\"High\":\"36.950001\",\"Low\":\"36.43\",\"Close\":\"36.66\",\"Volume\":\"7768600\",\"Adj_Close\":\"36.66\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-20\",\"Open\":\"36.049999\",\"High\":\"36.720001\",\"Low\":\"35.880001\",\"Close\":\"36.50\",\"Volume\":\"34311000\",\"Adj_Close\":\"36.50\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-19\",\"Open\":\"36.939999\",\"High\":\"37.23\",\"Low\":\"36.669998\",\"Close\":\"37.02\",\"Volume\":\"7096500\",\"Adj_Close\":\"37.02\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-18\",\"Open\":\"37.09\",\"High\":\"37.50\",\"Low\":\"36.889999\",\"Close\":\"37.240002\",\"Volume\":\"8465900\",\"Adj_Close\":\"37.240002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-17\",\"Open\":\"37.439999\",\"High\":\"37.700001\",\"Low\":\"37.25\",\"Close\":\"37.27\",\"Volume\":\"11335500\",\"Adj_Close\":\"37.27\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-16\",\"Open\":\"37.029999\",\"High\":\"37.790001\",\"Low\":\"36.880001\",\"Close\":\"37.48\",\"Volume\":\"16976500\",\"Adj_Close\":\"37.48\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-13\",\"Open\":\"36.91\",\"High\":\"37.07\",\"Low\":\"36.380001\",\"Close\":\"36.48\",\"Volume\":\"10996700\",\"Adj_Close\":\"36.48\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-12\",\"Open\":\"37.389999\",\"High\":\"37.509998\",\"Low\":\"36.790001\",\"Close\":\"37.029999\",\"Volume\":\"11169200\",\"Adj_Close\":\"37.029999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-11\",\"Open\":\"37.279999\",\"High\":\"37.630001\",\"Low\":\"37.200001\",\"Close\":\"37.369999\",\"Volume\":\"9997400\",\"Adj_Close\":\"37.369999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-10\",\"Open\":\"37.169998\",\"High\":\"37.580002\",\"Low\":\"37.139999\",\"Close\":\"37.439999\",\"Volume\":\"7171400\",\"Adj_Close\":\"37.439999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-09\",\"Open\":\"36.970001\",\"High\":\"37.349998\",\"Low\":\"36.919998\",\"Close\":\"37.18\",\"Volume\":\"6149100\",\"Adj_Close\":\"37.18\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-06\",\"Open\":\"36.549999\",\"High\":\"37.310001\",\"Low\":\"36.490002\",\"Close\":\"37.23\",\"Volume\":\"9208300\",\"Adj_Close\":\"37.23\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-05\",\"Open\":\"37.060001\",\"High\":\"37.450001\",\"Low\":\"36.860001\",\"Close\":\"36.939999\",\"Volume\":\"13699200\",\"Adj_Close\":\"36.939999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-04\",\"Open\":\"35.810001\",\"High\":\"36.09\",\"Low\":\"35.740002\",\"Close\":\"36.00\",\"Volume\":\"9649300\",\"Adj_Close\":\"36.00\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-03\",\"Open\":\"36.25\",\"High\":\"36.41\",\"Low\":\"35.91\",\"Close\":\"36.009998\",\"Volume\":\"8775000\",\"Adj_Close\":\"36.009998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-05-02\",\"Open\":\"36.650002\",\"High\":\"36.740002\",\"Low\":\"36.32\",\"Close\":\"36.529999\",\"Volume\":\"6581900\",\"Adj_Close\":\"36.529999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-29\",\"Open\":\"36.509998\",\"High\":\"36.98\",\"Low\":\"36.150002\",\"Close\":\"36.599998\",\"Volume\":\"11954100\",\"Adj_Close\":\"36.599998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-28\",\"Open\":\"36.84\",\"High\":\"37.439999\",\"Low\":\"36.509998\",\"Close\":\"36.59\",\"Volume\":\"13148500\",\"Adj_Close\":\"36.59\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-27\",\"Open\":\"37.52\",\"High\":\"37.59\",\"Low\":\"36.630001\",\"Close\":\"36.950001\",\"Volume\":\"16391200\",\"Adj_Close\":\"36.950001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-26\",\"Open\":\"37.32\",\"High\":\"37.540001\",\"Low\":\"36.91\",\"Close\":\"37.110001\",\"Volume\":\"10059600\",\"Adj_Close\":\"37.110001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-25\",\"Open\":\"37.470001\",\"High\":\"37.540001\",\"Low\":\"37.18\",\"Close\":\"37.23\",\"Volume\":\"9823500\",\"Adj_Close\":\"37.23\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-22\",\"Open\":\"37.50\",\"High\":\"38.09\",\"Low\":\"37.16\",\"Close\":\"37.48\",\"Volume\":\"9071800\",\"Adj_Close\":\"37.48\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-21\",\"Open\":\"37.919998\",\"High\":\"38.119999\",\"Low\":\"37.349998\",\"Close\":\"37.669998\",\"Volume\":\"11633700\",\"Adj_Close\":\"37.669998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-20\",\"Open\":\"37.099998\",\"High\":\"38.189999\",\"Low\":\"37.00\",\"Close\":\"37.84\",\"Volume\":\"30758900\",\"Adj_Close\":\"37.84\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-19\",\"Open\":\"36.459999\",\"High\":\"36.73\",\"Low\":\"36.110001\",\"Close\":\"36.330002\",\"Volume\":\"20014100\",\"Adj_Close\":\"36.330002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-18\",\"Open\":\"36.240002\",\"High\":\"37.00\",\"Low\":\"35.880001\",\"Close\":\"36.52\",\"Volume\":\"17723000\",\"Adj_Close\":\"36.52\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-15\",\"Open\":\"37.130001\",\"High\":\"37.150002\",\"Low\":\"36.419998\",\"Close\":\"36.509998\",\"Volume\":\"19016200\",\"Adj_Close\":\"36.509998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-14\",\"Open\":\"37.470001\",\"High\":\"37.50\",\"Low\":\"36.849998\",\"Close\":\"37.169998\",\"Volume\":\"16609000\",\"Adj_Close\":\"37.169998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-13\",\"Open\":\"36.939999\",\"High\":\"37.349998\",\"Low\":\"36.900002\",\"Close\":\"37.310001\",\"Volume\":\"17158700\",\"Adj_Close\":\"37.310001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-12\",\"Open\":\"36.650002\",\"High\":\"36.830002\",\"Low\":\"36.279999\",\"Close\":\"36.66\",\"Volume\":\"10439400\",\"Adj_Close\":\"36.66\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-11\",\"Open\":\"36.380001\",\"High\":\"36.849998\",\"Low\":\"36.32\",\"Close\":\"36.48\",\"Volume\":\"13709600\",\"Adj_Close\":\"36.48\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-08\",\"Open\":\"36.849998\",\"High\":\"36.919998\",\"Low\":\"35.619999\",\"Close\":\"36.07\",\"Volume\":\"20251100\",\"Adj_Close\":\"36.07\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-07\",\"Open\":\"35.860001\",\"High\":\"37.25\",\"Low\":\"35.720001\",\"Close\":\"36.169998\",\"Volume\":\"38653800\",\"Adj_Close\":\"36.169998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-06\",\"Open\":\"36.400002\",\"High\":\"37.00\",\"Low\":\"36.310001\",\"Close\":\"36.66\",\"Volume\":\"19418600\",\"Adj_Close\":\"36.66\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-05\",\"Open\":\"36.700001\",\"High\":\"36.919998\",\"Low\":\"36.220001\",\"Close\":\"36.41\",\"Volume\":\"12439200\",\"Adj_Close\":\"36.41\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-04\",\"Open\":\"36.549999\",\"High\":\"37.50\",\"Low\":\"36.540001\",\"Close\":\"37.02\",\"Volume\":\"20210800\",\"Adj_Close\":\"37.02\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-04-01\",\"Open\":\"36.540001\",\"High\":\"36.880001\",\"Low\":\"36.310001\",\"Close\":\"36.48\",\"Volume\":\"13650400\",\"Adj_Close\":\"36.48\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-31\",\"Open\":\"36.509998\",\"High\":\"37.02\",\"Low\":\"36.50\",\"Close\":\"36.810001\",\"Volume\":\"18666200\",\"Adj_Close\":\"36.810001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-30\",\"Open\":\"36.610001\",\"High\":\"37.279999\",\"Low\":\"36.439999\",\"Close\":\"36.560001\",\"Volume\":\"19836500\",\"Adj_Close\":\"36.560001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-29\",\"Open\":\"35.049999\",\"High\":\"36.43\",\"Low\":\"35.009998\",\"Close\":\"36.32\",\"Volume\":\"23166500\",\"Adj_Close\":\"36.32\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-28\",\"Open\":\"35.389999\",\"High\":\"35.450001\",\"Low\":\"34.619999\",\"Close\":\"35.23\",\"Volume\":\"12976800\",\"Adj_Close\":\"35.23\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-24\",\"Open\":\"34.450001\",\"High\":\"34.869999\",\"Low\":\"33.93\",\"Close\":\"34.860001\",\"Volume\":\"14101500\",\"Adj_Close\":\"34.860001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-23\",\"Open\":\"35.43\",\"High\":\"35.700001\",\"Low\":\"34.709999\",\"Close\":\"34.799999\",\"Volume\":\"12192600\",\"Adj_Close\":\"34.799999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-22\",\"Open\":\"34.68\",\"High\":\"35.610001\",\"Low\":\"34.68\",\"Close\":\"35.41\",\"Volume\":\"11272300\",\"Adj_Close\":\"35.41\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-21\",\"Open\":\"35.00\",\"High\":\"36.099998\",\"Low\":\"35.00\",\"Close\":\"35.470001\",\"Volume\":\"13279400\",\"Adj_Close\":\"35.470001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-18\",\"Open\":\"34.540001\",\"High\":\"35.209999\",\"Low\":\"34.380001\",\"Close\":\"35.169998\",\"Volume\":\"20490800\",\"Adj_Close\":\"35.169998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-17\",\"Open\":\"33.880001\",\"High\":\"34.549999\",\"Low\":\"33.869999\",\"Close\":\"34.279999\",\"Volume\":\"9334100\",\"Adj_Close\":\"34.279999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-16\",\"Open\":\"33.029999\",\"High\":\"34.080002\",\"Low\":\"33.00\",\"Close\":\"34.009998\",\"Volume\":\"10975700\",\"Adj_Close\":\"34.009998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-15\",\"Open\":\"33.32\",\"High\":\"33.459999\",\"Low\":\"33.110001\",\"Close\":\"33.259998\",\"Volume\":\"10660800\",\"Adj_Close\":\"33.259998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-14\",\"Open\":\"33.75\",\"High\":\"34.09\",\"Low\":\"33.509998\",\"Close\":\"33.580002\",\"Volume\":\"7960300\",\"Adj_Close\":\"33.580002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-11\",\"Open\":\"33.290001\",\"High\":\"33.860001\",\"Low\":\"32.84\",\"Close\":\"33.810001\",\"Volume\":\"11682700\",\"Adj_Close\":\"33.810001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-10\",\"Open\":\"33.59\",\"High\":\"33.599998\",\"Low\":\"32.09\",\"Close\":\"32.82\",\"Volume\":\"19452000\",\"Adj_Close\":\"32.82\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-09\",\"Open\":\"33.09\",\"High\":\"33.52\",\"Low\":\"32.779999\",\"Close\":\"33.509998\",\"Volume\":\"12647100\",\"Adj_Close\":\"33.509998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-08\",\"Open\":\"33.66\",\"High\":\"33.82\",\"Low\":\"32.84\",\"Close\":\"32.93\",\"Volume\":\"21007300\",\"Adj_Close\":\"32.93\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-07\",\"Open\":\"33.68\",\"High\":\"34.380001\",\"Low\":\"33.59\",\"Close\":\"33.959999\",\"Volume\":\"22924000\",\"Adj_Close\":\"33.959999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-04\",\"Open\":\"32.91\",\"High\":\"33.93\",\"Low\":\"32.759998\",\"Close\":\"33.860001\",\"Volume\":\"22915200\",\"Adj_Close\":\"33.860001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-03\",\"Open\":\"32.709999\",\"High\":\"33.209999\",\"Low\":\"32.419998\",\"Close\":\"32.880001\",\"Volume\":\"11355600\",\"Adj_Close\":\"32.880001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-02\",\"Open\":\"32.810001\",\"High\":\"33.240002\",\"Low\":\"32.77\",\"Close\":\"32.91\",\"Volume\":\"10458600\",\"Adj_Close\":\"32.91\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-03-01\",\"Open\":\"32.040001\",\"High\":\"32.849998\",\"Low\":\"32.040001\",\"Close\":\"32.799999\",\"Volume\":\"14833600\",\"Adj_Close\":\"32.799999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-29\",\"Open\":\"31.309999\",\"High\":\"32.459999\",\"Low\":\"31.309999\",\"Close\":\"31.790001\",\"Volume\":\"19208700\",\"Adj_Close\":\"31.790001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-26\",\"Open\":\"31.68\",\"High\":\"31.90\",\"Low\":\"31.219999\",\"Close\":\"31.370001\",\"Volume\":\"16683500\",\"Adj_Close\":\"31.370001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-25\",\"Open\":\"30.74\",\"High\":\"31.360001\",\"Low\":\"30.24\",\"Close\":\"31.360001\",\"Volume\":\"19907400\",\"Adj_Close\":\"31.360001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-24\",\"Open\":\"30.41\",\"High\":\"31.120001\",\"Low\":\"29.799999\",\"Close\":\"30.950001\",\"Volume\":\"12613500\",\"Adj_Close\":\"30.950001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-23\",\"Open\":\"31.200001\",\"High\":\"31.379999\",\"Low\":\"30.51\",\"Close\":\"30.67\",\"Volume\":\"17072300\",\"Adj_Close\":\"30.67\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-22\",\"Open\":\"30.65\",\"High\":\"31.209999\",\"Low\":\"30.389999\",\"Close\":\"31.17\",\"Volume\":\"21465100\",\"Adj_Close\":\"31.17\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-19\",\"Open\":\"30.190001\",\"High\":\"30.23\",\"Low\":\"29.700001\",\"Close\":\"30.040001\",\"Volume\":\"20735000\",\"Adj_Close\":\"30.040001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-18\",\"Open\":\"29.559999\",\"High\":\"30.139999\",\"Low\":\"29.389999\",\"Close\":\"29.42\",\"Volume\":\"15319400\",\"Adj_Close\":\"29.42\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-17\",\"Open\":\"29.469999\",\"High\":\"29.66\",\"Low\":\"29.059999\",\"Close\":\"29.370001\",\"Volume\":\"12949700\",\"Adj_Close\":\"29.370001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-16\",\"Open\":\"27.98\",\"High\":\"29.440001\",\"Low\":\"27.940001\",\"Close\":\"29.280001\",\"Volume\":\"20187900\",\"Adj_Close\":\"29.280001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-12\",\"Open\":\"27.120001\",\"High\":\"27.32\",\"Low\":\"26.719999\",\"Close\":\"27.040001\",\"Volume\":\"13011900\",\"Adj_Close\":\"27.040001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-11\",\"Open\":\"26.459999\",\"High\":\"26.969999\",\"Low\":\"26.15\",\"Close\":\"26.76\",\"Volume\":\"11188200\",\"Adj_Close\":\"26.76\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-10\",\"Open\":\"27.110001\",\"High\":\"27.809999\",\"Low\":\"26.84\",\"Close\":\"27.10\",\"Volume\":\"9098800\",\"Adj_Close\":\"27.10\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-09\",\"Open\":\"26.639999\",\"High\":\"27.690001\",\"Low\":\"26.51\",\"Close\":\"26.82\",\"Volume\":\"14324800\",\"Adj_Close\":\"26.82\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-08\",\"Open\":\"27.610001\",\"High\":\"27.969999\",\"Low\":\"26.48\",\"Close\":\"27.049999\",\"Volume\":\"24498200\",\"Adj_Close\":\"27.049999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-05\",\"Open\":\"29.059999\",\"High\":\"29.139999\",\"Low\":\"27.73\",\"Close\":\"27.969999\",\"Volume\":\"16379600\",\"Adj_Close\":\"27.969999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-04\",\"Open\":\"27.91\",\"High\":\"29.23\",\"Low\":\"27.709999\",\"Close\":\"29.15\",\"Volume\":\"28548200\",\"Adj_Close\":\"29.15\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-03\",\"Open\":\"28.450001\",\"High\":\"28.610001\",\"Low\":\"26.57\",\"Close\":\"27.68\",\"Volume\":\"55707000\",\"Adj_Close\":\"27.68\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-02\",\"Open\":\"29.32\",\"High\":\"30.23\",\"Low\":\"28.129999\",\"Close\":\"29.059999\",\"Volume\":\"36544700\",\"Adj_Close\":\"29.059999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-02-01\",\"Open\":\"29.27\",\"High\":\"29.790001\",\"Low\":\"28.790001\",\"Close\":\"29.57\",\"Volume\":\"12905700\",\"Adj_Close\":\"29.57\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-29\",\"Open\":\"29.10\",\"High\":\"29.51\",\"Low\":\"28.51\",\"Close\":\"29.51\",\"Volume\":\"18979500\",\"Adj_Close\":\"29.51\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-28\",\"Open\":\"30.59\",\"High\":\"30.629999\",\"Low\":\"28.60\",\"Close\":\"28.75\",\"Volume\":\"15589300\",\"Adj_Close\":\"28.75\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-27\",\"Open\":\"29.90\",\"High\":\"30.530001\",\"Low\":\"29.450001\",\"Close\":\"29.690001\",\"Volume\":\"13534600\",\"Adj_Close\":\"29.690001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-26\",\"Open\":\"29.76\",\"High\":\"30.190001\",\"Low\":\"29.620001\",\"Close\":\"29.98\",\"Volume\":\"11426200\",\"Adj_Close\":\"29.98\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-25\",\"Open\":\"29.959999\",\"High\":\"30.389999\",\"Low\":\"29.66\",\"Close\":\"29.780001\",\"Volume\":\"23176900\",\"Adj_Close\":\"29.780001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-22\",\"Open\":\"29.969999\",\"High\":\"30.52\",\"Low\":\"29.309999\",\"Close\":\"29.75\",\"Volume\":\"16298100\",\"Adj_Close\":\"29.75\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-21\",\"Open\":\"28.75\",\"High\":\"29.799999\",\"Low\":\"28.190001\",\"Close\":\"29.309999\",\"Volume\":\"16282500\",\"Adj_Close\":\"29.309999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-20\",\"Open\":\"28.98\",\"High\":\"29.110001\",\"Low\":\"27.440001\",\"Close\":\"28.780001\",\"Volume\":\"20458900\",\"Adj_Close\":\"28.780001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-19\",\"Open\":\"29.84\",\"High\":\"30.00\",\"Low\":\"29.309999\",\"Close\":\"29.74\",\"Volume\":\"20053000\",\"Adj_Close\":\"29.74\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-15\",\"Open\":\"29.280001\",\"High\":\"29.77\",\"Low\":\"28.59\",\"Close\":\"29.139999\",\"Volume\":\"17572600\",\"Adj_Close\":\"29.139999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-14\",\"Open\":\"29.690001\",\"High\":\"30.57\",\"Low\":\"28.709999\",\"Close\":\"30.32\",\"Volume\":\"15031400\",\"Adj_Close\":\"30.32\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-13\",\"Open\":\"30.889999\",\"High\":\"31.17\",\"Low\":\"29.33\",\"Close\":\"29.440001\",\"Volume\":\"16692400\",\"Adj_Close\":\"29.440001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-12\",\"Open\":\"30.58\",\"High\":\"30.969999\",\"Low\":\"30.209999\",\"Close\":\"30.690001\",\"Volume\":\"13198500\",\"Adj_Close\":\"30.690001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-11\",\"Open\":\"30.65\",\"High\":\"30.75\",\"Low\":\"29.74\",\"Close\":\"30.17\",\"Volume\":\"17140100\",\"Adj_Close\":\"30.17\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-08\",\"Open\":\"30.51\",\"High\":\"31.540001\",\"Low\":\"30.00\",\"Close\":\"30.629999\",\"Volume\":\"26322800\",\"Adj_Close\":\"30.629999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-07\",\"Open\":\"30.969999\",\"High\":\"31.190001\",\"Low\":\"30.02\",\"Close\":\"30.16\",\"Volume\":\"21209100\",\"Adj_Close\":\"30.16\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-06\",\"Open\":\"31.67\",\"High\":\"32.459999\",\"Low\":\"31.60\",\"Close\":\"32.16\",\"Volume\":\"16047800\",\"Adj_Close\":\"32.16\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-05\",\"Open\":\"31.549999\",\"High\":\"32.330002\",\"Low\":\"31.530001\",\"Close\":\"32.200001\",\"Volume\":\"14301100\",\"Adj_Close\":\"32.200001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2016-01-04\",\"Open\":\"32.119999\",\"High\":\"32.349998\",\"Low\":\"31.139999\",\"Close\":\"31.40\",\"Volume\":\"25194400\",\"Adj_Close\":\"31.40\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-31\",\"Open\":\"33.220001\",\"High\":\"33.689999\",\"Low\":\"33.18\",\"Close\":\"33.259998\",\"Volume\":\"7423300\",\"Adj_Close\":\"33.259998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-30\",\"Open\":\"33.849998\",\"High\":\"34.040001\",\"Low\":\"33.349998\",\"Close\":\"33.369999\",\"Volume\":\"5933500\",\"Adj_Close\":\"33.369999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-29\",\"Open\":\"33.630001\",\"High\":\"34.169998\",\"Low\":\"33.599998\",\"Close\":\"34.040001\",\"Volume\":\"12621900\",\"Adj_Close\":\"34.040001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-28\",\"Open\":\"33.900002\",\"High\":\"33.91\",\"Low\":\"33.349998\",\"Close\":\"33.599998\",\"Volume\":\"11020800\",\"Adj_Close\":\"33.599998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-24\",\"Open\":\"34.189999\",\"High\":\"34.740002\",\"Low\":\"34.099998\",\"Close\":\"34.110001\",\"Volume\":\"3470700\",\"Adj_Close\":\"34.110001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-23\",\"Open\":\"34.240002\",\"High\":\"34.580002\",\"Low\":\"33.990002\",\"Close\":\"34.450001\",\"Volume\":\"13469200\",\"Adj_Close\":\"34.450001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-22\",\"Open\":\"32.990002\",\"High\":\"34.209999\",\"Low\":\"32.970001\",\"Close\":\"34.189999\",\"Volume\":\"15531300\",\"Adj_Close\":\"34.189999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-21\",\"Open\":\"33.119999\",\"High\":\"33.299999\",\"Low\":\"32.689999\",\"Close\":\"32.970001\",\"Volume\":\"9106700\",\"Adj_Close\":\"32.970001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-18\",\"Open\":\"33.099998\",\"High\":\"33.630001\",\"Low\":\"32.869999\",\"Close\":\"32.950001\",\"Volume\":\"16921800\",\"Adj_Close\":\"32.950001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-17\",\"Open\":\"33.810001\",\"High\":\"34.080002\",\"Low\":\"33.110001\",\"Close\":\"33.23\",\"Volume\":\"13243500\",\"Adj_Close\":\"33.23\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-16\",\"Open\":\"33.150002\",\"High\":\"33.880001\",\"Low\":\"32.91\",\"Close\":\"33.779999\",\"Volume\":\"12689400\",\"Adj_Close\":\"33.779999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-15\",\"Open\":\"32.529999\",\"High\":\"33.389999\",\"Low\":\"32.50\",\"Close\":\"33.029999\",\"Volume\":\"16140900\",\"Adj_Close\":\"33.029999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-14\",\"Open\":\"32.939999\",\"High\":\"33.27\",\"Low\":\"32.209999\",\"Close\":\"32.59\",\"Volume\":\"15949600\",\"Adj_Close\":\"32.59\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-11\",\"Open\":\"34.009998\",\"High\":\"34.150002\",\"Low\":\"32.82\",\"Close\":\"32.91\",\"Volume\":\"14936200\",\"Adj_Close\":\"32.91\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-10\",\"Open\":\"34.490002\",\"High\":\"34.73\",\"Low\":\"33.91\",\"Close\":\"34.630001\",\"Volume\":\"16174200\",\"Adj_Close\":\"34.630001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-09\",\"Open\":\"35.799999\",\"High\":\"35.84\",\"Low\":\"33.150002\",\"Close\":\"34.400002\",\"Volume\":\"45101900\",\"Adj_Close\":\"34.400002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-08\",\"Open\":\"34.240002\",\"High\":\"34.98\",\"Low\":\"34.029999\",\"Close\":\"34.849998\",\"Volume\":\"19852600\",\"Adj_Close\":\"34.849998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-07\",\"Open\":\"34.759998\",\"High\":\"34.919998\",\"Low\":\"34.470001\",\"Close\":\"34.68\",\"Volume\":\"12047900\",\"Adj_Close\":\"34.68\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-04\",\"Open\":\"34.34\",\"High\":\"35.200001\",\"Low\":\"34.18\",\"Close\":\"34.91\",\"Volume\":\"16109600\",\"Adj_Close\":\"34.91\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-03\",\"Open\":\"35.59\",\"High\":\"35.720001\",\"Low\":\"34.099998\",\"Close\":\"34.34\",\"Volume\":\"17080500\",\"Adj_Close\":\"34.34\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-02\",\"Open\":\"35.00\",\"High\":\"36.389999\",\"Low\":\"34.77\",\"Close\":\"35.650002\",\"Volume\":\"56708100\",\"Adj_Close\":\"35.650002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-12-01\",\"Open\":\"33.869999\",\"High\":\"33.889999\",\"Low\":\"33.470001\",\"Close\":\"33.709999\",\"Volume\":\"11020400\",\"Adj_Close\":\"33.709999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-30\",\"Open\":\"33.029999\",\"High\":\"33.830002\",\"Low\":\"32.849998\",\"Close\":\"33.810001\",\"Volume\":\"17534700\",\"Adj_Close\":\"33.810001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-27\",\"Open\":\"32.790001\",\"High\":\"33.09\",\"Low\":\"32.439999\",\"Close\":\"32.939999\",\"Volume\":\"5316100\",\"Adj_Close\":\"32.939999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-25\",\"Open\":\"32.77\",\"High\":\"33.52\",\"Low\":\"32.75\",\"Close\":\"33.16\",\"Volume\":\"13257200\",\"Adj_Close\":\"33.16\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-24\",\"Open\":\"33.09\",\"High\":\"33.189999\",\"Low\":\"32.610001\",\"Close\":\"32.959999\",\"Volume\":\"13364700\",\"Adj_Close\":\"32.959999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-23\",\"Open\":\"33.00\",\"High\":\"33.869999\",\"Low\":\"32.869999\",\"Close\":\"33.360001\",\"Volume\":\"11899700\",\"Adj_Close\":\"33.360001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-20\",\"Open\":\"32.860001\",\"High\":\"33.299999\",\"Low\":\"32.689999\",\"Close\":\"33.110001\",\"Volume\":\"12498500\",\"Adj_Close\":\"33.110001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-19\",\"Open\":\"33.209999\",\"High\":\"33.50\",\"Low\":\"32.580002\",\"Close\":\"32.630001\",\"Volume\":\"14222100\",\"Adj_Close\":\"32.630001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-18\",\"Open\":\"32.889999\",\"High\":\"33.02\",\"Low\":\"32.32\",\"Close\":\"32.98\",\"Volume\":\"11105600\",\"Adj_Close\":\"32.98\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-17\",\"Open\":\"33.009998\",\"High\":\"33.119999\",\"Low\":\"32.619999\",\"Close\":\"32.860001\",\"Volume\":\"10270400\",\"Adj_Close\":\"32.860001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-16\",\"Open\":\"32.23\",\"High\":\"32.990002\",\"Low\":\"32.119999\",\"Close\":\"32.950001\",\"Volume\":\"11087800\",\"Adj_Close\":\"32.950001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-13\",\"Open\":\"32.779999\",\"High\":\"33.040001\",\"Low\":\"32.169998\",\"Close\":\"32.189999\",\"Volume\":\"11063300\",\"Adj_Close\":\"32.189999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-12\",\"Open\":\"33.200001\",\"High\":\"33.849998\",\"Low\":\"33.130001\",\"Close\":\"33.23\",\"Volume\":\"14273100\",\"Adj_Close\":\"33.23\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-11\",\"Open\":\"34.209999\",\"High\":\"34.23\",\"Low\":\"33.029999\",\"Close\":\"33.380001\",\"Volume\":\"11804100\",\"Adj_Close\":\"33.380001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-10\",\"Open\":\"33.450001\",\"High\":\"34.130001\",\"Low\":\"33.259998\",\"Close\":\"33.990002\",\"Volume\":\"11511000\",\"Adj_Close\":\"33.990002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-09\",\"Open\":\"34.07\",\"High\":\"34.080002\",\"Low\":\"33.080002\",\"Close\":\"33.68\",\"Volume\":\"13645500\",\"Adj_Close\":\"33.68\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-06\",\"Open\":\"34.939999\",\"High\":\"35.200001\",\"Low\":\"33.459999\",\"Close\":\"34.200001\",\"Volume\":\"16608600\",\"Adj_Close\":\"34.200001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-05\",\"Open\":\"35.02\",\"High\":\"35.299999\",\"Low\":\"34.16\",\"Close\":\"35.119999\",\"Volume\":\"15679100\",\"Adj_Close\":\"35.119999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-04\",\"Open\":\"34.889999\",\"High\":\"35.240002\",\"Low\":\"34.75\",\"Close\":\"35.07\",\"Volume\":\"17501800\",\"Adj_Close\":\"35.07\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-03\",\"Open\":\"35.150002\",\"High\":\"35.34\",\"Low\":\"34.650002\",\"Close\":\"34.720001\",\"Volume\":\"12394300\",\"Adj_Close\":\"34.720001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-11-02\",\"Open\":\"35.459999\",\"High\":\"35.48\",\"Low\":\"35.07\",\"Close\":\"35.27\",\"Volume\":\"15206700\",\"Adj_Close\":\"35.27\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-30\",\"Open\":\"35.139999\",\"High\":\"35.700001\",\"Low\":\"35.049999\",\"Close\":\"35.619999\",\"Volume\":\"17418900\",\"Adj_Close\":\"35.619999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-29\",\"Open\":\"34.869999\",\"High\":\"35.150002\",\"Low\":\"34.700001\",\"Close\":\"35.049999\",\"Volume\":\"10796200\",\"Adj_Close\":\"35.049999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-28\",\"Open\":\"34.299999\",\"High\":\"35.27\",\"Low\":\"34.299999\",\"Close\":\"35.189999\",\"Volume\":\"15174300\",\"Adj_Close\":\"35.189999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-27\",\"Open\":\"34.970001\",\"High\":\"35.470001\",\"Low\":\"33.880001\",\"Close\":\"34.299999\",\"Volume\":\"26380900\",\"Adj_Close\":\"34.299999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-26\",\"Open\":\"33.130001\",\"High\":\"33.490002\",\"Low\":\"33.00\",\"Close\":\"33.400002\",\"Volume\":\"15810300\",\"Adj_Close\":\"33.400002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-23\",\"Open\":\"32.650002\",\"High\":\"33.360001\",\"Low\":\"32.240002\",\"Close\":\"33.169998\",\"Volume\":\"24308600\",\"Adj_Close\":\"33.169998\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-22\",\"Open\":\"31.26\",\"High\":\"31.90\",\"Low\":\"31.209999\",\"Close\":\"31.67\",\"Volume\":\"18501200\",\"Adj_Close\":\"31.67\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-21\",\"Open\":\"32.060001\",\"High\":\"32.43\",\"Low\":\"31.01\",\"Close\":\"31.120001\",\"Volume\":\"30390400\",\"Adj_Close\":\"31.120001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-20\",\"Open\":\"33.490002\",\"High\":\"33.59\",\"Low\":\"32.77\",\"Close\":\"32.830002\",\"Volume\":\"19349200\",\"Adj_Close\":\"32.830002\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-19\",\"Open\":\"33.259998\",\"High\":\"33.630001\",\"Low\":\"33.18\",\"Close\":\"33.50\",\"Volume\":\"10856500\",\"Adj_Close\":\"33.50\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-16\",\"Open\":\"33.639999\",\"High\":\"33.860001\",\"Low\":\"33.16\",\"Close\":\"33.369999\",\"Volume\":\"12209300\",\"Adj_Close\":\"33.369999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-15\",\"Open\":\"32.419998\",\"High\":\"33.490002\",\"Low\":\"32.400002\",\"Close\":\"33.48\",\"Volume\":\"19403800\",\"Adj_Close\":\"33.48\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-14\",\"Open\":\"32.279999\",\"High\":\"32.490002\",\"Low\":\"31.77\",\"Close\":\"32.09\",\"Volume\":\"11282800\",\"Adj_Close\":\"32.09\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-13\",\"Open\":\"32.560001\",\"High\":\"32.830002\",\"Low\":\"32.32\",\"Close\":\"32.34\",\"Volume\":\"15873800\",\"Adj_Close\":\"32.34\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-12\",\"Open\":\"32.709999\",\"High\":\"33.02\",\"Low\":\"32.549999\",\"Close\":\"32.860001\",\"Volume\":\"12580300\",\"Adj_Close\":\"32.860001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-09\",\"Open\":\"32.349998\",\"High\":\"32.689999\",\"Low\":\"31.99\",\"Close\":\"32.52\",\"Volume\":\"11830400\",\"Adj_Close\":\"32.52\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-08\",\"Open\":\"31.790001\",\"High\":\"32.50\",\"Low\":\"31.73\",\"Close\":\"32.369999\",\"Volume\":\"14245400\",\"Adj_Close\":\"32.369999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-07\",\"Open\":\"31.309999\",\"High\":\"31.99\",\"Low\":\"31.209999\",\"Close\":\"31.870001\",\"Volume\":\"12224800\",\"Adj_Close\":\"31.870001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-06\",\"Open\":\"30.790001\",\"High\":\"31.190001\",\"Low\":\"30.66\",\"Close\":\"30.959999\",\"Volume\":\"10963900\",\"Adj_Close\":\"30.959999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-05\",\"Open\":\"30.799999\",\"High\":\"31.200001\",\"Low\":\"30.35\",\"Close\":\"30.85\",\"Volume\":\"12883300\",\"Adj_Close\":\"30.85\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-02\",\"Open\":\"28.620001\",\"High\":\"30.709999\",\"Low\":\"28.43\",\"Close\":\"30.709999\",\"Volume\":\"29250500\",\"Adj_Close\":\"30.709999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-10-01\",\"Open\":\"28.950001\",\"High\":\"29.00\",\"Low\":\"28.440001\",\"Close\":\"28.91\",\"Volume\":\"14467600\",\"Adj_Close\":\"28.91\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-30\",\"Open\":\"28.65\",\"High\":\"29.110001\",\"Low\":\"28.49\",\"Close\":\"28.91\",\"Volume\":\"18317900\",\"Adj_Close\":\"28.91\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-29\",\"Open\":\"28.58\",\"High\":\"29.23\",\"Low\":\"27.85\",\"Close\":\"28.26\",\"Volume\":\"41895400\",\"Adj_Close\":\"28.26\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-28\",\"Open\":\"29.030001\",\"High\":\"29.219999\",\"Low\":\"27.200001\",\"Close\":\"27.60\",\"Volume\":\"49541300\",\"Adj_Close\":\"27.60\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-25\",\"Open\":\"29.66\",\"High\":\"29.709999\",\"Low\":\"28.91\",\"Close\":\"29.129999\",\"Volume\":\"12817500\",\"Adj_Close\":\"29.129999\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-24\",\"Open\":\"29.469999\",\"High\":\"29.57\",\"Low\":\"28.85\",\"Close\":\"29.34\",\"Volume\":\"19109900\",\"Adj_Close\":\"29.34\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-23\",\"Open\":\"30.559999\",\"High\":\"30.57\",\"Low\":\"29.629999\",\"Close\":\"29.74\",\"Volume\":\"12755400\",\"Adj_Close\":\"29.74\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-22\",\"Open\":\"30.780001\",\"High\":\"30.92\",\"Low\":\"30.17\",\"Close\":\"30.40\",\"Volume\":\"15614900\",\"Adj_Close\":\"30.40\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-21\",\"Open\":\"31.200001\",\"High\":\"31.74\",\"Low\":\"30.879999\",\"Close\":\"31.17\",\"Volume\":\"18745000\",\"Adj_Close\":\"31.17\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-18\",\"Open\":\"30.51\",\"High\":\"30.799999\",\"Low\":\"30.41\",\"Close\":\"30.74\",\"Volume\":\"20538300\",\"Adj_Close\":\"30.74\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-17\",\"Open\":\"31.309999\",\"High\":\"31.33\",\"Low\":\"30.809999\",\"Close\":\"30.93\",\"Volume\":\"17094200\",\"Adj_Close\":\"30.93\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-16\",\"Open\":\"31.139999\",\"High\":\"31.77\",\"Low\":\"30.99\",\"Close\":\"31.40\",\"Volume\":\"22179700\",\"Adj_Close\":\"31.40\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-15\",\"Open\":\"29.719999\",\"High\":\"31.23\",\"Low\":\"29.41\",\"Close\":\"31.040001\",\"Volume\":\"25661600\",\"Adj_Close\":\"31.040001\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-14\",\"Open\":\"30.68\",\"High\":\"30.92\",\"Low\":\"30.00\",\"Close\":\"30.32\",\"Volume\":\"22186900\",\"Adj_Close\":\"30.32\"},{\"Symbol\":\"YHOO\",\"Date\":\"2015-09-11\",\"Open\":\"31.09\",\"High\":\"31.43\",\"Low\":\"30.629999\",\"Close\":\"31.43\",\"Volume\":\"14365400\",\"Adj_Close\":\"31.43\"}]}}}";
	public void testClassModel(){
		StockHistoryHandler dataHandler = new StockHistoryHandler();
		List<Quote> stockQuotes = dataHandler.getStockQuotes(rawJsonData);
		String message = "Data Count: "+stockQuotes.size();
		assertSame(message,10,stockQuotes.size());
	}
}