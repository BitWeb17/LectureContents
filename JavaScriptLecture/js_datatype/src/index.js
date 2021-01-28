import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import DataTypeBasic from "./data_type/DataTypeBasic";
import DataType from "./data_type/DataType";
import StringDataType from "./data_type/StringDataType";
import RealDataType from "./data_type/RealDataType";
import ExpDataType from "./data_type/ExpDataType";
import BoolDataType from "./data_type/BoolDataType";
import ArrayDataType from "./data_type/ArrayDataType";
import JsonDataType from "./data_type/JsonDataType";

ReactDOM.render(
  <React.StrictMode>
      <DataTypeBasic/>
      <DataType/>
      <StringDataType/>
      <RealDataType/>
      <ExpDataType/>
      <BoolDataType/>
      <ArrayDataType/>
      <JsonDataType/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
