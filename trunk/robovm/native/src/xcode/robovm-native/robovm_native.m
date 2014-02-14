//
//  robovm_native.m
//  robovm-native
//
//  Created by Stephen More on 1/24/14.
//  Copyright (c) 2014 HelloWorld. All rights reserved.
//

#import "robovm_native.h"
#import <UIKit/UIKit.h>

@implementation robovm_native

-(void)displayAlert{
    UIAlertView *alert = [[UIAlertView alloc]
                          initWithTitle: @"Announcement"
                          message: @"This IS robovm!"
                          delegate: nil
                          cancelButtonTitle:@"OK"
                          otherButtonTitles:nil];
    [alert show];
}

-(int) doubleUp:(int)a {
    return a * 2;
}

-(int)add:(int)a :(int)b {
    return a + b;
}

@end
