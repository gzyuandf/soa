package org.soa.quartz.api.job;public class Job5 implements org.quartz.Job {public void execute(org.quartz.JobExecutionContext context)throws org.quartz.JobExecutionException {System.out.println("我是动态添加的jobss");}}