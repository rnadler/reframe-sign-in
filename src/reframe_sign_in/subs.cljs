(ns reframe-sign-in.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::password
 (fn [db]
   (:password db)))
