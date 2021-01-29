import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import Homework1 from "./homework/Homework1";
import Homework2 from "./homework/Homework2";
import Homework3 from "./homework/Homework3";
import Homework4 from "./homework/Homework4";

ReactDOM.render(
  <React.StrictMode>
    <Homework1/>
    <Homework2/>
    <Homework3/>
    <Homework4/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
