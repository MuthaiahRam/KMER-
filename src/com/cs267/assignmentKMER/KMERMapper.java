package com.cs267.assignmentKMER;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class KMERMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	public void map(LongWritable key, Text value, Context con)
			throws IOException, InterruptedException {

		String line = value.toString();
		if (line.contains(">gi") && line.length() < 9) {
			
			return;
		}

			for (int merCounter = 0; merCounter < line.length() - 9; merCounter++)

			{

				Text outputKey = new Text(line.substring(merCounter, merCounter + 9).trim());

				IntWritable outputValue = new IntWritable(1);

				con.write(outputKey, outputValue);

			}
		}
	}


