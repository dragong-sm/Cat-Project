import React, { useEffect } from "react";
import "./App.css";
import { Home } from "./pages/Home";
import { useState } from "react";
import { Route, Routes } from "react-router-dom";
import { axiosCatPictures, axiosCatData } from "./api/getCats";
import AboutPage from "./pages/AboutPage";
import { ErrorPage } from "./pages/ErrorPage";
import { ReactPropTypes } from "react";

function App() {
  // 페이지구성
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about/:catId" element={<AboutPage />} />
        
        <Route path="/about/:id" component={<AboutPage />} />
        <Route path="*" element={<ErrorPage />} />
      </Routes>
    </div>
  );
}

export default App;
