package com.algo;

import com.algo.CodingTest.NaverFinancial.NaverFinancial;
import com.algo.collazConjecture.CollazConjecture;
import com.algo.kit.bfs_dfs.network.Network;
import com.algo.kit.bruteForce.carpet.Carpet;
import com.algo.kit.bruteForce.findingPrimeNumber.FindingPrimeNumber;
import com.algo.kit.dynamicProgramming.expressWithN.ExpressWithN;
import com.algo.kit.hash.bestAlbum.BestAlbum;
import com.algo.kit.hash.failedRunner.FailedRunner;
import com.algo.kit.heap.diskController.DiskController;
import com.algo.kit.heap.doulbePriorityQueue.DoublePriorityQueue;
import com.algo.kit.sort.biggestNumber.BiggestNumber;
import com.algo.kit.sort.h_index.H_index;
import com.algo.kit.sort.k_th_number.K_th_number;
import com.algo.kit.stackQueue.developeFunction.DevelopeFunction;
import com.algo.kit.stackQueue.printer.Printer;
import com.algo.kit.stackQueue.stockPrice.StockPrice;
import com.algo.kit.bruteForce.practiceTest.PracticeTest;
import com.algo.kit.hash.phoneNumberList.PhoneNumberList;
import com.algo.kit.heap.scovilleScale.ScovilleScale;
import com.algo.kit.stackQueue.truckOnBridge.TruckOnBridge;
import com.algo.kit.greedy.traingSuit.TrainingSuit;

public class AlgorithmRouter {
    public PhoneNumberList phoneNumberList = new PhoneNumberList();
    public CollazConjecture collazConjecture = new CollazConjecture();
    public PracticeTest practiceTest = new PracticeTest();
    public ScovilleScale scovilleScale = new ScovilleScale();
    public StockPrice stockPrice = new StockPrice();
    public BiggestNumber biggestNumber = new BiggestNumber();
    public BestAlbum bestAlbum = new BestAlbum();
    public Network network = new Network();
    public H_index h_index = new H_index();
    public FailedRunner failedRunner = new FailedRunner();
    public DevelopeFunction developeFunction = new DevelopeFunction();
    public TruckOnBridge truckOnBridge = new TruckOnBridge();
    public K_th_number k_th_number = new K_th_number();
    public Printer printer = new Printer();
    public DiskController diskController = new DiskController();
    public TrainingSuit trainingSuit = new TrainingSuit();
    public DoublePriorityQueue doublePriorityQueue = new DoublePriorityQueue();
    public int findingPrimeNumber(String numbers){
        return FindingPrimeNumber.execute(numbers);
    }
    public int[] carpet(int brown, int yellow){
        return Carpet.execute(brown, yellow);
    }
    public int expressWithN(int N, int number){
        return ExpressWithN.execute(N, number);
    }

    public NaverFinancial naverFinancial = new NaverFinancial();
}
