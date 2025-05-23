package Part1_1;

import java.io.*;
import Part1_1.FileSplitting;
import Part1_1.PrevalenceTest;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;
import Part1_1.Pair;

public class Main {

	public static void AllProccess(String inputFilePath, int N) throws ExecutionException {
		FileProcesson1 FileProcesson1 = new FileProcesson1();
		List<Pair> commons = new LinkedList<>();

		try {

			FileSplitting.splitFile(inputFilePath, 100000); // הקריאה לפונקציה הסטטית
			FileProcesson1.processFiles("C:\\Users\\user\\Desktop\\home_assignment_hadasim_5.0\\PartOne\\Part1_1");
			commons=PrevalenceTest.ReturnsTheCommons(N);
			for (int i = 0; i < commons.size(); i++) {
				System.out.println(commons.get(i).getFirst()+" :"+commons.get(i).getSecond());
			}
			

		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ExecutionException {
		// TODO Auto-generated method stub
		String inputFilePath = "C:\\Users\\user\\Desktop\\home_assignment_hadasim_5.0\\PartOne\\Part1_1";
		AllProccess(inputFilePath + "\\logs.txt", 20000);
	}
}
