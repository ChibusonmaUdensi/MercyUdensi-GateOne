const inquirer = require('inquirer');

const questions = [
  {
      message: 'How are you feeling lately?',
    choices: [
      'A. Feeling a bit tired',
      'B. Yes, I\'ve been having some cramps',
      'C. My mood has been all over the place lately',
      'D. Trying to practice more self care like taking warm baths',
      'E. I\'ve been trying to drink more water & eat healthier',
    ],
  },
  {
    message: 'Are you experiencing any cramps or discomfort?',
    choices: [
      'A. Yes, I've been experiencing cramps',
      'B. I\'ve been feeling bloated and uncomfortable',
      'C. I\'ve noticed some lower back pain',
      'D. I\'ve been experiencing breast tenderness',
      'E. I\'ve been feeling fatigued and achy',
    ],
  },
  {
    message: 'Did you notice any changes in your libido or energy levels recently?',
    choices: [
      'A. My libido has increased',
      'B. I haven\'t really paid attention to any changes',
      'C. I've noticed decrease in my sex drive',
      'D. I've been feeling more sensual driving this time',
      'E. I haven't been in the mood for sex lately',
    ],
  },
  {
     message: 'Have you been keeping track of your hydration & nutrition?',
    choices: [
      'A. Yes, I've been making sure to drink enough water & eat balanced meals',
      'B. I haven't been paying much attention to it lately',
      'C. I've been focusing on one more than the other',
      'D. I've been struggling to stay hydrated but I\'ve been eating well',
    ],
  },
  {
    message: 'Have you noticed any patterns or irregularities in your cycle?',
    choices: [
      'A. Yes, I've noticed that my cycle tends to be regular',
      'B. My cycle has been consistently irregular',
      'C. I've been experiencing spotting between periods',
      'D. I've noticed fluctuations in the length of my cycle',
    ],
  },
  {
   
    message: 'How is your stress level lately?',
    choices: [
      'A. I haven't been feeling stressed at all',
      'B. My stress levels have been fluctuating',
      'C. My stress level has been through the roof',
      'D. I'm feeling overwhelmed',
    ],
  },
  {
  
    message: 'Would you like reminders for your next period?',
  },
];

  console.log('How long does your period last? (in days)');
  let periodLength = parseInt(readlineSync.prompt()); 
  console.log('Enter first date of last menstrual period (DD/MM/YYYY): ');
  let firstDate = readlineSync.prompt(); 
  console.log('Enter the cycle length (in days): ');
  let cycleLength = parseInt(readlineSync.prompt()); 

  const localDate = new Date();

  if (cycleLength < 21 || cycleLength > 35) {
    console.log(
      'Irregular cycle. Your lifestyle choices can have a significant impact on your period. High stress levels, sudden weight loss, excessive exercise, and even changes in diet can lead to shorter periods.'
    );
  } else {
    console.log('Regular period');
  }

  const nextPeriod = new Date(firstDate);
  nextPeriod.setDate(nextPeriod.getDate() + cycleLength);

  console.log('Next Period:', nextPeriod.toLocaleDateString());

  const flowDates = new Date(nextPeriod);
  flowDates.setDate(flowDates.getDate() + periodLength -
