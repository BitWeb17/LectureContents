import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import DataTypeBasic from "./data_type/DataTypeBasic";
import DataType from "./data_type/DataType";

ReactDOM.render(
  <React.StrictMode>
      <DataTypeBasic/>
      <DataType/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
